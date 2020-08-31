package com.example.arrays;

public class MaxHistogramAreaDemo {

    public static void main(String[] args) {

        int[] input = {2,1,5,6,2,3};

        MaxHistogramArea area = new MaxHistogramArea();

        int result = area.maxHistogramArea(input);
        System.out.println("Max area of a rectangle = " + result);
    }
}
