package com.example.patterns.creational.abstractfactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {

        Computer pc = ComputerFactory.getComputer(new PCFactory("8GB", "500GB", "2.7"));
        System.out.println(pc);

    }
}
