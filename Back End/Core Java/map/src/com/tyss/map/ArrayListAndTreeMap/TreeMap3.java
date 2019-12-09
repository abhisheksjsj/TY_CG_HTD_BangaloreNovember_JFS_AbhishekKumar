package com.tyss.map.ArrayListAndTreeMap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap3 {
	public static void main(String[] args) {
		TreeMap<String, ArrayList<Student>> t1 = new TreeMap<String, ArrayList<Student>>();
		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(new Student(13, "Divya"));
		a1.add(new Student(13, "Anuu"));
		a1.add(new Student(13, "Akshay"));
		System.out.println(a1);

		t1.put("1st Std", a1);

		System.out.println(t1.get("1st Std"));

		Set<Entry<String, ArrayList<Student>>> s1 = t1.entrySet();

		for (Entry<String, ArrayList<Student>> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("-----------------");
		}
	}

}
