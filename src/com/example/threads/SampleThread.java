package com.example.threads;

public class SampleThread extends Thread implements Runnable{

	private int counter = 0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		counter++;
		System.out.println("Runnable Interface " + counter);
	}
	
	public static void main(String args[])throws Exception{
		SampleThread st = new SampleThread();
		st.run();
		
		st.run();
	}

}
