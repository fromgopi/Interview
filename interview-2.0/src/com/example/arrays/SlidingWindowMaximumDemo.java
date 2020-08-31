package com.example.arrays;

public class SlidingWindowMaximumDemo {

    public static void main(String[] args) {

        int[] input = {1,3,-1,-3,5,3,6,7};

        SlidingWindowMaximum obj = new SlidingWindowMaximum();

        obj.maxSlidingWindow(input, 3);
    }
}
