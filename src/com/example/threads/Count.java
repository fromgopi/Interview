package com.example.threads;

public class Count extends Thread{

    Count(){
        super("My Thread extending");
        System.out.println("my thread created" + this);
        start();
    }

    @Override
    public void run() {
        try {
            for (int i=0; i<10; i++){
                System.out.println("Printing the count " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("My Thread is done");
    }
}


