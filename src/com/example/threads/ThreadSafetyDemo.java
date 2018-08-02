package com.example.threads;

public class ThreadSafetyDemo {

    public static void main(String[] args) throws InterruptedException {

        ProcessingThreads pt = new ProcessingThreads();
        Thread t1 = new Thread(pt, "t1");
        t1.start();

        Thread t2 = new Thread(pt, "t2");
        t2.start();

        t1.join();
        t2.join();

        System.out.println(pt.getCount());

    }
}
