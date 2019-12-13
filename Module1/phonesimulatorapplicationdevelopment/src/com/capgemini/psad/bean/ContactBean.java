package com.capgemini.psad.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class ContactBean implements Serializable {

	private String name;
	private int number;
	private String group;

}// end of main class
