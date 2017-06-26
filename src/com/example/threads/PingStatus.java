package com.example.threads;

import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.net.ssl.HttpsURLConnection;

public class PingStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int threads = 10;
		ExecutorService executor = Executors.newFixedThreadPool(threads);
		String hostList[] = {"http://google.com/","http://facebook.com","http://mail.yahoo.com","http://amazon.in",
						 "http://makemytrip.com","http://.wikipedia.org"};
		for(int i=0;i<hostList.length;i++){
			String url = hostList[i];
			Runnable worker = new MyRunnable(url); 
			executor.execute(worker);
			}
		executor.shutdown();
		while (!executor.isTerminated()) {
			 
		}
		System.out.println("\nFinished all threads");
	}
	
	public static class MyRunnable implements Runnable{
		private final String url;
		
		public MyRunnable(String url) {
			// TODO Auto-generated constructor stub
			this.url = url;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			String result = "";
			int code = 200;
			try{
				URL siteURL = new URL(url);
				HttpsURLConnection connection = (HttpsURLConnection)siteURL.openConnection();
				connection.setRequestMethod("POST");
				connection.connect();
				
				code = connection.getResponseCode();
				if(code == 200){
					result = "Green\t";
				}
			}catch (Exception e) {
				// TODO: handle exception
				result = "->Red<-\t";
			}
			System.out.println(url + "\t\tStatus:" + result);
		}
	}
}
