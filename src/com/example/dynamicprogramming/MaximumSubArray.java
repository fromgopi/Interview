package com.example.dynamicprogramming;

public class MaximumSubArray {

    int findMaxSum(int nums[]){
        int sum = 0; int max = Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            sum = sum < 0 ? nums[i] : (sum + nums[i]);
            max = Math.max(sum, max);
        }

        return max;
    }

    int findSumMax(int nums[]){
        if (nums == null || nums.length == 0) { return 0; }
        int max = nums[0], sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum < 0) { sum = nums[i]; }
            else {sum += nums[i]; }
            max = Math.max(max, sum);
        }
        return max;
    }

}
