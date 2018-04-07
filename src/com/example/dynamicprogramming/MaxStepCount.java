package com.example.dynamicprogramming;

public class MaxStepCount {

    public int countWays(int dis){

        int[] count = new int[dis + 1];
        count[0] = 0;
        count[1] = 1;

        for(int i=2; i<=dis; i++){
            count[i] = count[i-1] + count[i-2];
        }

        return count[dis];
    }

}
