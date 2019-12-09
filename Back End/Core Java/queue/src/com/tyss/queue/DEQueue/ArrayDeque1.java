package com.tyss.queue.DEQueue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque1 {
	public static void main(String[] args) {
		ArrayDeque a1 = new ArrayDeque();
		a1.add(23);
		a1.add(34);
		a1.addLast(11);
		a1.add(45);
		a1.add(100);
		a1.add(45);
		
		System.out.println(a1);

		Iterator itr = a1.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}

}
