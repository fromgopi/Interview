package com.example.general;

public class LargestPrimeFactorDemo {

    public static void main(String[] args) {

        long number = 600851475143L;
        boolean isPrime = true;

        LargestPrimeFactor factor = new LargestPrimeFactor();

        factor.findLargestPrimeFactor(number, isPrime);

    }
}
