package com.example.general;

public class EvenFibonacci {

    public void getEvenFib(long range){
        long a=2, b=8, sum=10, c=0;

        while (b < range){
            sum += c;

            c = b*4+a;
            a = b;
            b = c;
        }

        System.out.println("range = " + sum);
    }

}
