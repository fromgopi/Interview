package com.example.leetcode.medium.arrays;

public class MinTicketCost {


    int minCostTickets(int[] days, int[] costs){
        int lastDay = days[days.length-1];

        int[] dp = new int[lastDay + 1];
        boolean[] isTravel = new boolean[lastDay+1];

        //Set all days in isTravel to true.
        for (int day: days){
            isTravel[day] = true;
        }

        for (int i = 1; i <= lastDay; i++) {
            if (!isTravel[i]){
                dp[i] = dp[i-1];
                continue;
            }
            // Calculate the ticket cost.
            // For 1 day
            dp[i] = costs[0] + dp[i-1];
            // For 7 days
            dp[i] = Math.min(costs[1] + dp[Math.max(i - 7, 0)], dp[i]);
            // For 30 days
            dp[i] = Math.min(costs[2] + dp[Math.max(i - 30, 0)], dp[i]);
        }

        printDP(dp);
        return dp[lastDay];
    }

    private void printDP(int dp[]){
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + ",");
        }
        System.out.println();
    }
}
