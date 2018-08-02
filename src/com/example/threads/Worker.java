package com.example.threads;

public class Worker implements Runnable{

    String command;

    Worker(String str){
        this.command = str;
    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
        processCommand();
        System.out.println(Thread.currentThread().getName()+" End.");
    }

    private void processCommand() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    public String toString(){
        return this.command;
    }
}
