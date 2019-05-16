package com.example.leetcode.medium.arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberIII {

    int[] singleMatch(int[] nums){
        int[] res = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i])+1);
            else
                map.put(nums[i], 1);
        }
        int i=0;
        for (Map.Entry<Integer, Integer> set : map.entrySet()){
            if(set.getValue() == 1){
                res[i] = set.getKey();
                i++;
            }
        }
        return res;
    }
}
