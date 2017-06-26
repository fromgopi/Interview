package com.example.threads;

public class PrintDemo {

	void printCounter(){
		try{
			for(int i=5;i>=0;i--){
				System.out.println("Counter --- " + i);
				Thread.sleep(2000);
			}
		}catch(Exception e){
			System.out.println("Interrupted...");
		}
	}	
}
