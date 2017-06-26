package com.example.threads;

public class CriticalSectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c = new Counter();
		Thread t1 = new Thread();
		t1.setDaemon(true);
		t1.start();
		
		c.add(33);
	}

}
