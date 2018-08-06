package com.example.patterns.creational.factory;

import java.util.Scanner;

public class PlanFactoryDemo {
    public static void main(String[] args) {

        PlanFactory factory = new PlanFactory();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Plan name for which the bill has to be generated.");

        String type = sc.next();

        System.out.println("Enter the number of units used.");

        Integer units = sc.nextInt();

        Plan p = factory.getPlan(type);

        System.out.print("Bill amount for "+type+" of  "+units+" units is: ");
        p.getRate();
        p.calculateBill(units);

    }
}
