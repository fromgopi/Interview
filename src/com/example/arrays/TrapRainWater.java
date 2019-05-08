package com.example.arrays;

class TrapRainWater {
    void trapWater(int[] nums) {

        int left = 0, right = nums.length-1;
        int leftBar = 0, rightBar = 0, sum=0;

        while (left <= right) {
            System.out.println("Left = " + left + ", nums[leftbar] = " + nums[leftBar] + ", Right = " + right + ", nums[rightBar] = " + nums[rightBar] + ", sum = " + sum);
            if(leftBar <= rightBar) {
                if(nums[left] >= leftBar){
                    leftBar = nums[left];
                } else {
                    sum += leftBar - nums[left];
                }
                left++;
            } else {
                if(nums[right] >= rightBar) {
                    rightBar = nums[right];
                } else {
                    sum += rightBar - nums[right];
                }
                right--;
            }
        }

        System.out.println("Result is " + sum);
    }
}
