package com.capgemini.retailermaintenancesystemapplicationdevelopment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailermaintenancesystemapplicationdevelopment.dao.ProductDAO;
import com.capgemini.retailermaintenancesystemapplicationdevelopment.dto.ProductInfoBean;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAO dao;

	@Override
	public boolean registerProduct(ProductInfoBean bean) {
		return false;
	}

	@Override
	public List<ProductInfoBean> getAllProducts(String key) {
		return dao.getAllProducts(key);
	}

	@Override
	public boolean deleteProduct(int id) {
		return dao.deleteProduct(id);
	}

}
