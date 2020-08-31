package com.example.arrays;

public class SlidingWindowMaximum {

    void maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int[] left = new int[len];
        int[] right = new int[len];
        int[] ans = new int[len - k + 1];

        for(int i = 0, j = len - 1; i < len && j >= 0; i++, j--){
            if(i % k == 0) left[i] = nums[i];
            else left[i] = Math.max(left[i - 1], nums[i]);

            if(j == len - 1 || (j + 1) % k == 0) right[j] = nums[j];
            else right[j] = Math.max(right[j + 1], nums[j]);
        }

        for(int i = 0; i < len - k + 1; i++){
            ans[i] = Math.max(left[i + k - 1], right[i]);
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
