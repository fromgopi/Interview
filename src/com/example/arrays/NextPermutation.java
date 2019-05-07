package com.example.arrays;

public class NextPermutation {


    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int i = len - 1;

        while (i >= 1 && nums[i] <= nums[i - 1]) {
            i--;
        }
        i--; // this is the pivot
        // now find the least digit greater than nums[i] to the right of nums[i]
        if (i >= 0) {
            int j;
            for (j = len - 1; j > i; j--)
                if (nums[j] > nums[i])
                    break;
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start) {
        for (int i = start, j = nums.length - 1; i < j; i++, j--)
            swap(nums, i, j);
    }
}