package com.example.arrays;

public class SearchRangeInArray {

    int[] search(int[] nums, int target){
        int[] result = {-1,-1};
        if(nums == null || nums.length==0)
            return result;
        result= helper(nums,target, 0, nums.length-1);
        result[0] = result[0] == Integer.MAX_VALUE ? -1 : result[0];
        result[1] = result[1] == Integer.MIN_VALUE ? -1 : result[1];
        return result;
    }
    private int[] helper(int[] nums, int target, int start, int end){
        int[] result = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        if(start>end)
            return result;
        int mid = start+ (end-start)/2;
        if(nums[mid] == target){
            result[0]=mid;
            result[1]=mid;
        }
        int[] left={Integer.MAX_VALUE, Integer.MIN_VALUE};
        int[] right={Integer.MAX_VALUE, Integer.MIN_VALUE};
        if(nums[mid]>=target){
            left = helper(nums,target,start, mid-1);
        }
        if(nums[mid]<=target){
            right = helper(nums,target,mid+1,end);
        }
        result[0]=Math.min(Math.min(result[0],left[0]),right[0]);
        result[1]=Math.max(Math.max(result[1],right[1]),left[1]);
        return result;
    }
}
