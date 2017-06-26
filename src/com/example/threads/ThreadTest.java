package com.example.threads;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintDemo pd = new PrintDemo();
		NewThreadDemo t1 = new NewThreadDemo("Thread-1", pd);
		NewThreadDemo t2 = new NewThreadDemo("Thread-2", pd);
		t1.start();
		t2.start();
		
		try{
			t1.join();
			t2.join();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
