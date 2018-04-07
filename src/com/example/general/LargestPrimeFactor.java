package com.example.general;

public class LargestPrimeFactor {

    void findLargestPrimeFactor(long number, boolean isPrime){

        long i=2;

        for( ; i<number;i++){
            while ( number % i == 0){
                number /= i;
            }
        }

        System.out.println("i= " + (i-1));
    }

}
