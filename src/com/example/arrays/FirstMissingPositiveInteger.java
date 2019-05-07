package com.example.arrays;

import java.util.HashMap;
import java.util.Map;

public class FirstMissingPositiveInteger {

    public int find(int[] nums){
        for (int i=0;i<nums.length;i++){
            int val = nums[i];
            while(val<=nums.length && val > 0 && val != nums[val-1]){
                if(val <= nums.length){
                    int tmp = nums[val-1];
                    nums[val-1] = val;
                    val = tmp;
                }
            }
        }
        for(int i=0; i<nums.length; i++){
            if(i+1 != nums[i])
                return i+1;
        }
        return nums.length+1;
    }


    int findUsingMap(int[] nums){
        Map<Integer, Boolean> checked = new HashMap<>();
        int ans = 1;

        for (int num : nums){
            if (num > 0) {
                checked.put(num, true);
                if (num == ans){
                    while (checked.getOrDefault(ans, false)){
                        ans++;
                    }
                }
            }
        }

        return ans;
    }
}
