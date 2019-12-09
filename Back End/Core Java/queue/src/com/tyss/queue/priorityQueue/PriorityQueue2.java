package com.tyss.queue.priorityQueue;

import java.util.PriorityQueue;

public class PriorityQueue2 {
	public static void main(String[] args) {
		PriorityQueue<Student> p1 = new PriorityQueue<Student>();
		p1.offer(new Student("Divya", 23));
		p1.offer(new Student("Shree", 29));
		p1.offer(new Student("Divya", 23));

		for (Student student : p1) {
			System.out.println(p1);
		}
	}
}
