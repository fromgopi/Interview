package com.example.arrays;

import java.util.Arrays;

public class MaxProductOfThree {

    public int findMax(int[] nums){

        Arrays.sort(nums);
        int a = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int b = nums[0] * nums[1] * nums[nums.length - 1];
        return a > b ? a : b;

    }

}
