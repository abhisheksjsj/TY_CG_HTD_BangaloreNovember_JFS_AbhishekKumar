package com.capgemini.retailermaintenancesystemapplicationdevelopment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.capgemini.retailermaintenancesystemapplicationdevelopment.dto.UserInfoBean;
import com.capgemini.retailermaintenancesystemapplicationdevelopment.exception.UserException;

@Repository
public class UserDAOImpl implements UserDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public UserInfoBean auth(String email, String password) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from UserInfoBean where email=:email";
		TypedQuery<UserInfoBean> query = manager.createQuery(jpql, UserInfoBean.class);
		query.setParameter("email", email);
		query.setParameter("password", password);
		try {
			UserInfoBean bean = query.getSingleResult();
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			if (encoder.matches(password, bean.getPassword())) {
				return bean;
			} else {
				throw new UserException("Password Invalid");
			}
		} catch (Exception e) {
			throw new UserException("Email Invalid");
		}
	}

	@Override
	public boolean register(UserInfoBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new UserException("User already exist");
		}

	}

	@Override
	public List<UserInfoBean> getAllUsers(String key) {
		String jpql = "from UserInfoBean where name=:name or email=:email";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<UserInfoBean> query = manager.createQuery(jpql, UserInfoBean.class);
		query.setParameter("name", key);
		query.setParameter("email", key);
		query.getSingleResult();
		return query.getResultList();
	}

	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		UserInfoBean bean = manager.find(UserInfoBean.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}

	@Override
	public boolean deleteUser(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		UserInfoBean bean = manager.find(UserInfoBean.class, id);
		if (bean != null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		throw new UserException("User Not Found");
	}

}
