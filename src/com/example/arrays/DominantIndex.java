/**
 * @Ref: leet-code number 747(Largest Number At Least Twice of Others)
 * @author: Muktevigk
 * @params: array
 * @return: index of the largest number in array.
 */

package com.example.arrays;

public class DominantIndex {

    public int dominant(int [] nums){
        if(nums == null || nums.length == 0){
            return -1;
        }

        if(nums.length == 1){
            return 0;
        }

        int max = -1;
        int secondMax = -2;

        int index = 0;

        for (int i=0; i<nums.length; i++){
            if(nums[i] > max){
                secondMax = max;
                max = nums[i];
                index = i;
            }else if(nums[i] != max && nums[i] > secondMax){
                secondMax = nums[i];
            }
        }

        if(secondMax*2 <= max){
            return index;
        }

        return -1;
    }

}
