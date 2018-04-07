package com.example.dynamicprogramming;

public class MaxStepCountDemo {

    public static void main(String[] args) {
        
        int distance = 14;
        
        MaxStepCount count = new MaxStepCount();
        int res = count.countWays(distance);
        System.out.println("Number of ways to climb  = " + res);
    }
    
}
