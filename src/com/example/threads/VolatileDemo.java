package com.example.threads;

public class VolatileDemo extends Thread{

	 boolean keepRunning = true;
	public void run(){
		int counter=0;
		while(keepRunning){
			counter++;
		}
		System.out.println("Thread terminated...." + counter);
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		VolatileDemo v = new VolatileDemo();
		v.start();
		v.sleep(2000);
		v.keepRunning = false;
		System.out.println("KeepRunning set to false");
			
	}

}
