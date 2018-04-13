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


    public int climbStairs(int n){
        int[] dp = new int[n + 1];
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i - 2];
        }
        return dp[n];

    }

}
