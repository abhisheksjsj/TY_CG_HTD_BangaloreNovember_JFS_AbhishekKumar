package com.tyss.accessSpecifier.pack2;

import com.tyss.accessSpecifier.pack1.Person;
import static com.tyss.accessSpecifier.pack1.Person.age;
import com.tyss.accessSpecifier.pack1.*;

public class TestPerson {
	public static void main(String[] args) {

		Person p1 = new Person("Vivek");
		System.out.println(p1.name);
		System.out.println(Person.age);
		System.out.println(age);

	}

}
