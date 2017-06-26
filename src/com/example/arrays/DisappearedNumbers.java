package com.example.arrays;

import java.util.ArrayList;

import java.util.List;

public class DisappearedNumbers {

	List<Integer> find(int [] nums){
		List<Integer> res = new ArrayList<Integer>();
		
		for(int i=0;i<nums.length-1;i++){
			while(nums[i] != i+1 && nums[i] != nums[nums[i]-1]){
				int temp = nums[i];
				nums[i] = nums[temp-1];
				nums[temp - 1] = temp;
			}
		}
		for(int i=0;i<nums.length;i++){
			if(nums[i] != i+1){
				res.add(i+1);
			}
		}
		
		return res;
	}
}
