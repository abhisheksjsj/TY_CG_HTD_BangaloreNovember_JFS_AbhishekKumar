package com.capgemini.retailermaintenancesystemapplicationdevelopment.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "product_info")
public class ProductInfoBean {

	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private int user_id;
	@Column(unique = true, nullable = false)
	private String name;
	@Column
	private int quantity;
	@Column
	private String details;
	
	private List<UserInfoBean> bean;
	
	

}
