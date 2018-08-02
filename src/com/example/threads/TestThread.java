package com.example.threads;

public class TestThread extends Thread{

    String name;
    TheDemo theDemo;

    public TestThread(String name, TheDemo theDemo) {
        this.name = name;
        this.theDemo = theDemo;
        start();
    }

    @Override
    public void run(){
        theDemo.test(name);
    }
}
