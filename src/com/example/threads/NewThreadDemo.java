package com.example.threads;

public class NewThreadDemo extends Thread{

	private Thread t;
	private String name;
	PrintDemo pd;
	
	public NewThreadDemo(String tName, PrintDemo pD) {
		// TODO Auto-generated constructor stub
		this.name = tName;
		this.pd = pD;
	}
	
	public void start(){
		System.out.println("Starting " + name);
		if(t == null){
			t = new Thread(this, name);
			t.start();
		}
	}
	
	public void run(){
		synchronized (pd) {
			pd.printCounter();
			System.out.println("Thread " + name + " exiting...");
		}
		/*pd.printCounter();
		System.out.println("Thread " + name + " exiting...");*/
	}
}
