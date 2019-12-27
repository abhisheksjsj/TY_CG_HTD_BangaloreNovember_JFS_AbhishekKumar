package com.capgemini.jpawithhibernate.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.capgemini.jpawithhibernate.onetoone.EmployeeInfo;

import lombok.Data;

@Data
@Entity
@Table(name = "training_info")
public class TrainingInfo {
	@Id
	@Column
	private int tid;
	@Column
	private String name;
	@Column
	private int duration;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employee_training", 
	joinColumns = @JoinColumn(name = "tid"), 
	inverseJoinColumns = @JoinColumn(name = "eid"))   //to make a new table and map the PK of both table

	private List<EmployeeInfo> eList;
}
