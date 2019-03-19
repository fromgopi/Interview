package com.example.threads;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.net.ssl.HttpsURLConnection;

public class PingStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int threads = 30;
		ExecutorService executor = Executors.newFixedThreadPool(threads);
		String hostList[] = {"http://crunchify.com", "http://yahoo.com", "http://www.ebay.com",
				"https://google.com",
				"http://www.example.co", "https://paypal.com",
				"http://bing.com/", "http://techcrunch.com/", "http://mashable.com/",
				"https://thenextweb.com/", "http://wordpress.com/",
				"http://wordpress.org/", "http://example.com/", "http://sjsu.edu/",
				"https://ebay.co.uk/", "http://google.co.uk/", "http://wikipedia.org/"};
		//Thread worker = new Thread(new MyRunnable());
		for(int i=0;i<hostList.length;i++){
			String url = hostList[i];
            Runnable worker1 = new MyRunnable(url);
            executor. execute(worker1);
            /*Thread worker = new Thread(new MyRunnable(url));
            worker.run();*/
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
            try {
                URL siteURL = new URL(url);
                HttpURLConnection connection = (HttpURLConnection) siteURL.openConnection();
                connection.setRequestMethod("GET");
                connection.setConnectTimeout(3000);
                connection.connect();

                code = connection.getResponseCode();
                if (code == 200) {
                    result = "-> Green <-\t" + "Code: " + code;
                    ;
                } else {
                    result = "-> Yellow <-\t" + "Code: " + code;
                }
            } catch (Exception e) {
                result = "-> Red <-\t" + "Wrong domain - Exception: " + e.getMessage();

            }
            System.out.println(url + "\t\tStatus:" + result);
		}
	}
}
