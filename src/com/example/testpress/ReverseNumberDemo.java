package com.example.testpress;

import java.util.Scanner;

public class ReverseNumberDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to reverse");
        int inputNumber = sc.nextInt();
        ReverseNumber reverseNumber = new ReverseNumber();
        System.out.println(reverseNumber.reverse(inputNumber));
    }


}
