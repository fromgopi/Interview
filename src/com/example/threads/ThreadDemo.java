package com.example.threads;

public class ThreadDemo implements Runnable {

	private String name;
	public ThreadDemo(String Name) {
		// TODO Auto-generated constructor stub
		this.name = Name;
		System.out.println("Creating " + name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running " + name);
		try{
			for(int i=4;i>=0;i--){
				System.out.println("Thread : " + name + " , " + i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println("Thread " + name + " exiting");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo td = new ThreadDemo("Thread-1");
		ThreadDemo td1 = new ThreadDemo("Thread-2");
		td.run();
		td1.run();
		
	}

}
