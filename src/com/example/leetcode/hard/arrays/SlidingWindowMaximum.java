package com.example.leetcode.hard.arrays;

import com.example.general.PrintArray;

public class SlidingWindowMaximum {

    int[] findMaxSlidingWindow(int[] nums, int k){

        int n = nums.length;
        if (n == 0) {
            return new int[]{};
        }
        System.out.println(" K = " + k);
        int[] result = new int[n-k+1];
        PrintArray.print(result);
        int max = findMax(nums, 0, k-1);
        System.out.println("Max = " + max + " Before the loop starts.");
        for (int i = 0, j = k; j < n; i++, j++) {
            System.out.println("i=" + i + ", j=" + j + ", Max = " + max);
            result[i] = max;
            if (nums[i] == max) {
                max = findMax(nums, i+1, j);
            } else if (nums[j] > max) {
                max = nums[j];
            }
        }

        result[n-k] = max;
        return result;
    }

    private int findMax(int[] nums, int i, int j) {
        int max = Integer.MIN_VALUE;
        for (int m = i; m <= j; m++) max = Math.max(max, nums[m]);
        return max;
    }

}
