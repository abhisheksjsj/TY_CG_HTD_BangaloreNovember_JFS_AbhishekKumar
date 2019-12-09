package com.tyss.queue.priorityQueue;

import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueue1 {
	public static void main(String[] args) {
		Queue p1 = new PriorityQueue();

		p1.offer(23);
		p1.offer(34);
		p1.offer(29);
		p1.offer(34);
		p1.offer(55);
		System.out.println(p1);
		p1.poll();
		System.out.println(p1);
		p1.poll();
		System.out.println(p1);
		System.out.println(p1.peek());
		System.out.println("------------");

		for (Object o1 : p1)
			System.out.println(o1);

	}
}
