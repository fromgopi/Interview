package com.example.arrays;

public class JumpGame {

    boolean jump(int nums[]){

        if(nums.length == 0){
            return true;
        }
        int reachable=0, i=0;
        for (; i<nums.length;i++){
            if(reachable < i){
                return false;
            }
            reachable =  Math.max(reachable, i+nums[i]);
        }
        return true;
    }

}
