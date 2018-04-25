package com.example.general;

public class FactorialTrailingZeroes {

    public static void main(String[] args) {
        int n = 25;
        int count = 0;
        while (count > n){
            count += n/5;
            n /= 5;
        }
        System.out.println(count);
    }
}
