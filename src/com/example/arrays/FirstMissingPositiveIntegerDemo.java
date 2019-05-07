package com.example.arrays;

public class FirstMissingPositiveIntegerDemo {

    public static void main(String[] args) {

        int[] nums = {1,7,8,9,11,12};

        FirstMissingPositiveInteger positiveInteger = new FirstMissingPositiveInteger();
        System.out.println(positiveInteger.find(nums));
        System.out.println("Using Map");
        System.out.println(positiveInteger.findUsingMap(nums));
    }
}
