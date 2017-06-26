package com.example.threads;

public class EvenThread  implements Runnable {

	public void run(){
		int evenNumber = 2;
		while(true){
			evenNumber += 2;
			System.out.println(Thread.currentThread().getName() + " ---> " + evenNumber);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			if(evenNumber == 30){
				break;
			}
		}
	}
	
}
