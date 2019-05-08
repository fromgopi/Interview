package com.example.arrays;

public class TrapRainWaterDemo {

    public static void main(String[] args) {
        int[] nums = {2, 0, 1, 0, 3, 1, 2, 1};


        TrapRainWater trap = new TrapRainWater();

        trap.trapWater(nums);
    }
}
