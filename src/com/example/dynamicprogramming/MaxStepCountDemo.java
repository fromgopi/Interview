package com.example.dynamicprogramming;

public class MaxStepCountDemo {

    public static void main(String[] args) {
        
        int distance = 14;
        
        MaxStepCount count = new MaxStepCount();
        int res1 = count.countWays(distance);
        System.out.println("res1 = " + res1);
        int res = count.climbStairs(distance);
        System.out.println("Number of ways to climb  = " + res);
    }
    
}
