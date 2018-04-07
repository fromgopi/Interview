/**
 * Project Euler #18: Maximum path sum I
 * @author: Muktevigk
 * @params: Array of triange
 * @return: Max path sum (int)
 */


package com.example.dynamicprogramming;


public class MaxPathSumInTriDemo {

    public static void main(String[] args) {
        int tri[][] = { {3,0,0,0},{7,4,0,0},{3,4,6,0},{8,5,9,3} };

        MaxPathSumInTri sum = new MaxPathSumInTri();
        sum.findMaxPathSum(tri);
    }

}
