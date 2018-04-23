package com.example.dynamicprogramming;

public class MinPathSumDemo {

    public static void main(String[] args) {
        int[][] array = { {1,3,1},
                          {1,5,1},
                          {4,2,1} };

        MinPathSum min = new MinPathSum();

        System.out.println("min.findMin(array) = " + min.findMin(array));

    }

}
