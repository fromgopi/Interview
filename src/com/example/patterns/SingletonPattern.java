package com.example.patterns;

public class SingletonPattern {

    public static SingletonPattern singleton;

    private SingletonPattern(){
        System.out.println("Singleton(): Initializing Instance");
    }

    public static SingletonPattern getSingleton(){
        if(singleton == null){
            synchronized(SingletonPattern.class){
                if(singleton == null){
                    System.out.println("getSingleton () is called or invoked for the first time.");
                }
            }
        }

        return singleton;
    }

    public void doSomething(){
        System.out.println("DoSomething(): is also invoked.");
    }
}
