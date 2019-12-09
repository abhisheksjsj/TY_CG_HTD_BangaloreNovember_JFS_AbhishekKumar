package com.tyss.map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> l1 = new LinkedHashMap<String, Integer>();
		l1.put("BTM", 560076);
		l1.put("RajajiNagar", 567000);
		l1.put("OldAirportRoad", 230076);
		l1.put("BTR", 450005);
		//only one Key as Null and any no. of Values can be Null
		l1.put(null, null);

		l1.remove("BTR");

		Set<Map.Entry<String, Integer>> s1 = l1.entrySet();

		// System.out.println(s1);
		System.out.println("--------------------");

		for (Entry<String, Integer> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("--------------------");
		}

		System.out.println(l1.size());
		System.out.println(l1.isEmpty());
		System.out.println(l1.containsKey("BTM"));
		System.out.println(l1.containsValue(567000));

		System.out.println("------------");
		System.out.println(l1.keySet());
		System.out.println(l1.values());
	}

}
