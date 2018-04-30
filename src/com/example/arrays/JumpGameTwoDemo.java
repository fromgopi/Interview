package com.example.arrays;

public class JumpGameTwoDemo {

    public static void main(String[] args) {
        int[] nums = {2,1,1,1,4};

        JumpGameTwo jp2 = new JumpGameTwo();

        System.out.println(jp2.findJump(nums));
    }
}
