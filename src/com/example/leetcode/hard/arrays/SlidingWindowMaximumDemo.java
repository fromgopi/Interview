package com.example.leetcode.hard.arrays;

import com.example.general.PrintArray;

public class SlidingWindowMaximumDemo {

    // LC-239.
    public static void main(String[] args) {

        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 4;

        SlidingWindowMaximum slm = new SlidingWindowMaximum();
        int[] res = slm.findMaxSlidingWindow(nums, k);

        PrintArray.print(res);
    }
}
