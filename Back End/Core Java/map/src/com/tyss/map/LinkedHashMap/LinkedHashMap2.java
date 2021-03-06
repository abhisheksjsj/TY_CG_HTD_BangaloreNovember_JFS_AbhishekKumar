package com.tyss.map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap2 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, Employee> l1 = new LinkedHashMap<Integer, Employee>();
		l1.put(34, new Employee(23000, "Aniket"));
		l1.put(56, new Employee(23000, "Divya"));
		l1.put(67, new Employee(34000, "Anish"));

		System.out.println(l1.get(34));

		Set<Map.Entry<Integer, Employee>> s1 = l1.entrySet();
		for (Map.Entry<Integer, Employee> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("------------------");
		}

		System.out.println(l1.containsKey(34));
		System.out.println(l1.containsValue(new Employee(56, "Divya")));
		System.out.println(l1.containsValue(new Employee(56, "Abhi")));
		
	}

}
