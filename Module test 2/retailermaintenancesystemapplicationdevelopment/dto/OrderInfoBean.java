package com.capgemini.retailermaintenancesystemapplicationdevelopment.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "order_info")
public class OrderInfoBean {

	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private int product_id;
	@Column
	private int user_id;

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id", referencedColumnName = "id")
	private UserInfoBean bean;
	
	

}
