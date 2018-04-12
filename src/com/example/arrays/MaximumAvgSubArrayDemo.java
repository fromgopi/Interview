package com.example.arrays;

public class MaximumAvgSubArrayDemo {

    public static void main(String[] args) {

        int array[] = {1,12,-5,-6,50,3};

        MaximumAvgSubArray avgSubArra = new MaximumAvgSubArray();

        System.out.println(avgSubArra.findAvg(array, 4));

    }
}
