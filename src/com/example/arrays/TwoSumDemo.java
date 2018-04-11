package com.example.arrays;

public class TwoSumDemo {

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};

        int target = 13;

        TwoSum sum = new TwoSum();

        int res [] = sum.findSum(nums, target);

        for(int i=0;i<res.length;i++){
            System.out.println(res[i] + ",");
        }

    }

}
