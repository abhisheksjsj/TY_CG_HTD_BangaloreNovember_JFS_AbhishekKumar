package com.tyss.accessSpecifier.pack1;

public class Person {
	public String name;
	public static int age = 45;

	public Person(String name) {
		this.name = name;
	}

	public void details() {
		System.out.println("The person name is" + name);
	}
}
