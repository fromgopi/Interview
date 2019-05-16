package com.example.leetcode.medium.arrays;

public class MinTicketCostDemo {
    // Medium LC-983

    public static void main(String[] args) {
        int[] days = {1,4,6,7,8,20};
        int[] cost = {2,7,15};

        MinTicketCost mc = new MinTicketCost();
        System.out.println(mc.minCostTickets(days, cost));
    }

}
