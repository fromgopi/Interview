package com.example.threads;

public class EvenOddThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread odd = new Thread(new OddThread(), "Odd-Thread");
		Thread t = new Thread();
		t.start();
		System.out.println("-------- " + t.isAlive());
		//odd.run();
		odd.sleep(1000);
		Thread even = new Thread(new EvenThread(), "Even-Thread");
		//even.run();
	}

}
