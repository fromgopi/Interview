package com.example.dynamicprogramming;

import java.util.Arrays;

public class PerfectSquares {

    int findSquares(int n){
        int memo[] = new int[n+1];
        Arrays.fill(memo, -1);
        memo[0] = 0;

        return (helper(n, memo));
    }

    private int helper(int n, int[] memo) {
        if(memo[n] != -1) {
            return memo[n];
        }

        int root = (int) Math.sqrt(n), min = Integer.MAX_VALUE;
        for(int i = root; i > 0; i--) {
            min = Math.min(helper(n-i*i, memo), min);
        }
        memo[n] = min + 1;
        return memo[n];
    }


    int findMinSquare(int n){

        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 1;
        for(int s=1;s*s<=n;s++){
            int ss = s*s;
            System.out.println("ss = " + ss);
            /*dp[ss] = 1;

            for(int i=ss+1; i<=n;i++){
                dp[i] = Math.min(dp[i], dp[i - ss] + 1);
            }*/
        }
        return dp[n];
    }

}
