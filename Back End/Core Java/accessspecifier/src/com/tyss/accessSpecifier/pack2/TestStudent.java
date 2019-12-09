package com.tyss.accessSpecifier.pack2;

import com.tyss.accessSpecifier.pack1.Student;

public class TestStudent extends Student {
	protected TestStudent(String studName) {
		super(studName);
		// TODO Auto-generated constructor stub
	}

	void studentDetails() {
		System.out.println("The Student name is" + studName);
	}

	public static void main(String[] args) {
		TestStudent ts1 = new TestStudent("John");
		ts1.studentDetails();
		ts1.studDetails();

	}

}
