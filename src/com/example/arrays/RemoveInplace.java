package com.example.arrays;

import java.util.HashMap;
import java.util.Map;

public class RemoveInplace {

	Map<Object, Integer> m = new HashMap<>();
	
	int remove(int nums[], int val){
		int len = nums.length-1;
		for(int i=0;i<len;i++){
			while(nums[i] == val && i < len){
				nums[i] = nums[--len];
			}
		}
		return len;
	}
	
	
}
