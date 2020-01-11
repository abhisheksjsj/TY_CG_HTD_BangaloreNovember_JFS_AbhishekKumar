package com.capgemini.retailermaintenancesystemapplicationdevelopment.dao;

import java.util.List;

import com.capgemini.retailermaintenancesystemapplicationdevelopment.dto.ProductInfoBean;

public interface ProductDAO {

	public boolean registerProduct(ProductInfoBean bean);

	public List<ProductInfoBean> getAllProducts(String key);

	public boolean deleteProduct(int id);

}
