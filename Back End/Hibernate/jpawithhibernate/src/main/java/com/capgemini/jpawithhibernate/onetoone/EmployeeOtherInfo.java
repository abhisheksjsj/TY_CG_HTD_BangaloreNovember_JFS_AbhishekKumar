package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_otherinfo")
public class EmployeeOtherInfo {
	@Id
	@Column
	private int id;
	@Column
	private String pancard;
	@Column(name = "fathername")
	private String fname;
	@Column(name = "mothername")
	private String mname;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "eid")
	private EmployeeInfo employee;

}
