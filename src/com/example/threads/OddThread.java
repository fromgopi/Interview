package com.example.threads;

public class OddThread extends Thread implements Runnable {

	public void start(){
		
	}
	
	public void interrupt(){
		
	}
	
	public void run(){
		int oddNum = 1;
		synchronized (this) {
			while(true){
				oddNum += 2;
				System.out.println(Thread.currentThread().getName() + " -----> " + oddNum);
				try{
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				if(oddNum == 31){
					break;
				}
			}
		}
		
	}
	
	
}
