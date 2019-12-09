package com.tyss.map.hashMap;

import java.util.Collection;
import java.util.HashMap;

public class HashMap2 {
	public static void main(String[] args) {
		HashMap<Integer, Student> h1 = new HashMap<Integer, Student>();
		h1.put(54, new Student(22, "Divya"));
		h1.put(44, new Student(23, "Shree"));
		// h1.put(null, new Student(27, "Guldu"));
		h1.put(34, new Student(55, "Vivek"));
		h1.put(null, new Student(43, "Ramesh"));
		System.out.println(h1);
		System.out.println("----------");

		Collection<Student> c1 = h1.values();

		for (Student s1 : c1) {
			System.out.println(s1);
		}
		System.out.println("-------------------");

		System.out.println(h1.containsKey(54));
		// we need to override toString and hashCode()
		System.out.println(h1.containsValue(new Student(55, "Vivek")));
		System.out.println("--------------");

		System.out.println(h1.size());
		System.out.println(h1.isEmpty());

	}

}
