package com.tyss.thread.createThread;

public class TestA {
	public static void main(String[] args) {
		System.out.println("main started..");
		// will create two stack memory
		// one Object of the thread will be executed by its own
		Thread1 t1 = new Thread1();
		t1.start();
		// automatically run will execute with start
		System.out.println("main ended...");
	}

}
