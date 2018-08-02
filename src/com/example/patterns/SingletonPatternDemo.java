package com.example.patterns;

public class SingletonPatternDemo {

    public static void main(String[] args) {

        SingletonPattern instance = SingletonPattern.getSingleton();
        System.out.println(instance);
        Pattern p = new Pattern();

        System.out.println(p);

    }
}
