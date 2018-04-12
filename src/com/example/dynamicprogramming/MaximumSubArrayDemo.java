/**
 * Leet 53. Maximum Subarray
 * @author: Muktevigk
 * @Params: Array of type in
 * @Return: Max sum of the elements in array.
 * @Approch: Dynamic Programming to calc max sum in array.
 */
package com.example.dynamicprogramming;

import java.util.Random;
import java.util.Scanner;

public class MaximumSubArrayDemo {

    public static void main(String[] args) {

        //int nums[] = {-2,1,-3,4,-1,2,1,-5,4};

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        //int temp[] = new int[];

        System.out.println("Enter the lenght of array\n");
        int p = sc.nextInt();
        int nums[] = new int [p];
        for(int i=0;i<nums.length;i++){
            nums[i] = r.nextInt(p);
        }

        MaximumSubArray subArray = new MaximumSubArray();

        //System.out.println(subArray.findMaxSum(nums));
        System.out.println(subArray.findSumMax(nums));

    }

}
