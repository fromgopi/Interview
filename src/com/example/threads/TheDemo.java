package com.example.threads;

public class TheDemo {

    public synchronized void test(String name){
        for (int i=0;i<=5;i++){
            System.out.println(Thread.currentThread());
            SOP.print(name + " :: " +i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                SOP.print(e.getMessage());
            }
        }
    }


    public static void main(String[] args) {
        TheDemo theDemo = new TheDemo();
        new TestThread("THREAD 1",theDemo);
        new TestThread("THREAD 2",theDemo);
        new TestThread("THREAD 3",theDemo);
    }
}
