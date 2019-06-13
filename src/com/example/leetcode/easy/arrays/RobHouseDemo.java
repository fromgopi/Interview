package com.example.leetcode.easy.arrays;

public class RobHouseDemo {

    //LC-198
    public static void main(String[] args) {

        int[] nums = {1,2,3,1,4,5,7,11,3,33};

        RobHouse rh = new RobHouse();
        System.out.println(rh.rob(nums));
    }
}
