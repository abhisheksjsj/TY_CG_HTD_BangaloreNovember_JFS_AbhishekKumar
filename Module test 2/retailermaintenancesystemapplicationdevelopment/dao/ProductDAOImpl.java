package com.capgemini.retailermaintenancesystemapplicationdevelopment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.retailermaintenancesystemapplicationdevelopment.dto.ProductInfoBean;
import com.capgemini.retailermaintenancesystemapplicationdevelopment.exception.UserException;

@Repository
public class ProductDAOImpl implements ProductDAO {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean registerProduct(ProductInfoBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new UserException("Product already exist or Do you want to reorder");
		}

	}

	@Override
	public List<ProductInfoBean> getAllProducts(String key) {
		String jpql = "from ProductInfoBean where name=:name or email=:email";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<ProductInfoBean> query = manager.createQuery(jpql, ProductInfoBean.class);
		query.setParameter("name", key);
		query.setParameter("email", key);
		query.getSingleResult();
		return query.getResultList();
	}

	@Override
	public boolean deleteProduct(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		ProductInfoBean bean = manager.find(ProductInfoBean.class, id);
		if (bean != null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		throw new UserException("Product Not Found");
	}
}
