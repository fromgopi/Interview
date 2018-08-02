package com.example.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for(int i=0; i<100; i++){
            Runnable worker = new Worker(Integer.toString(i));
            executorService.execute(worker);
        }

        executorService.shutdown();

        while(!executorService.isTerminated()){
        }

        System.out.println("Finished all Threads");

    }
}
