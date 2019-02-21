package com.example.threads;

public class CountDemo {
    public static void main(String[] args) {

        Count count = new Count();
        System.out.println(count);
        try {
            while (count.isAlive()){
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main Thread run is done");

    }
}
