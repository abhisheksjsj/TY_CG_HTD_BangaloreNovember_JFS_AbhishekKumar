package com.tyss.queue.DEQueue;

import java.util.ArrayDeque;

public class ArrayDeque2 {
	public static void main(String[] args) {
		ArrayDeque<String> a1 = new ArrayDeque<String>();
		a1.add("Vicky");
		a1.add("Guldu");
		a1.add("Anish");
		a1.add("Vicky");
		a1.add("Akshay");
		a1.add("Guldu");
		System.out.println(a1);

		a1.addFirst("Shree");
		System.out.println(a1);
		a1.addLast("Sai");
		System.out.println(a1);
		System.out.println("----------------");
		System.out.println(a1.getFirst());
		System.out.println(a1.getLast());
		System.out.println("--------------");
		a1.remove("Shree");
		System.out.println(a1);
		System.out.println("------------removeFirst    removeLast--------");
		System.out.println(a1.removeFirst());
		System.out.println(a1);
		System.out.println(a1.removeLast());
		System.out.println(a1);
		System.out.println("--------removeFistOccurence--------removeLastOccurence---------");
		a1.removeFirstOccurrence("Guldu");
		System.out.println(a1);
		a1.removeLastOccurrence("Guldu");
		System.out.println(a1);
		System.out.println("------peek()-------");
		System.out.println(a1.peek());
		

	}
}
