package com.example.threads;

public class ProcessingThreads implements Runnable{

    private int counter = 0;

    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            synchronized (ProcessingThreads.class){
                processSomething(i);
                counter ++;
            }
        }
    }

    public int getCount() {
        return this.counter;
    }

    private void processSomething(int i) {
        System.out.println("Inside processSomething method " + this.counter);
        try {
            Thread.sleep(i*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
