package com.example.arrays;

public class SearchInArray {

    boolean search(int[] nums, int target){

        if(nums[0] == target){
            return true;
        }

        for (int i=1;i<nums.length;i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;
    }
}
