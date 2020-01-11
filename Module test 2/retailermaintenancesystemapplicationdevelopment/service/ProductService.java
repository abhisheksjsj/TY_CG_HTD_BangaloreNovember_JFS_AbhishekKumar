package com.capgemini.retailermaintenancesystemapplicationdevelopment.service;

import java.util.List;

import com.capgemini.retailermaintenancesystemapplicationdevelopment.dto.ProductInfoBean;

public interface ProductService {

	public boolean registerProduct(ProductInfoBean bean);

	public List<ProductInfoBean> getAllProducts(String key);

	public boolean deleteProduct(int id);

}
