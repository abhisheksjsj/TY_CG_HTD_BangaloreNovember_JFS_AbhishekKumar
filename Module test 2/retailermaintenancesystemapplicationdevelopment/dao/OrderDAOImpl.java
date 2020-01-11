package com.capgemini.retailermaintenancesystemapplicationdevelopment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.retailermaintenancesystemapplicationdevelopment.dto.OrderInfoBean;
import com.capgemini.retailermaintenancesystemapplicationdevelopment.exception.UserException;

@Repository
public class OrderDAOImpl implements OrderDAO {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean registerOrder(OrderInfoBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new UserException("Order is already done");
		}

	}

	@Override
	public List<OrderInfoBean> getAllOrders(String key) {
		String jpql = "from OrderInfoBean where name=:name or email=:email";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<OrderInfoBean> query = manager.createQuery(jpql, OrderInfoBean.class);
		query.setParameter("name", key);
		query.setParameter("email", key);
		query.getSingleResult();
		return query.getResultList();
	}

	@Override
	public boolean deleteOrder(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		OrderInfoBean bean = manager.find(OrderInfoBean.class, id);
		if (bean != null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		throw new UserException("Order Not Found");
	}

}
