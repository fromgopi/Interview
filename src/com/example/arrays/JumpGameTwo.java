package com.example.arrays;

public class JumpGameTwo {

    int findJump(int nums[]){
        int step = 0;
        int low = 0;
        int high = 0;
        while(high < nums.length-1){
            int preLow = low;
            int preHigh = high;
            for(int t = preLow;t <= preHigh;t++)
                high = Math.max(t+nums[t], high);
            low = preHigh+1;
            step++;
        }
        return step;
    }
}
