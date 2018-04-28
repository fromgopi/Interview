package com.example.PQ;

import java.util.Random;
import java.util.Scanner;

public class KthLargestUsingPQDemo {

    public static void main(String[] args) {

        //int[] nums = {5,3,1,2,6,4};
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Please enter size if the array...");
        int len = sc.nextInt();
        int[] nums = new int[len];
        for(int i=0;i<nums.length;i++){
            nums[i] = r.nextInt(len);
        }
        System.out.println("Select largest element in array.");
        int k = sc.nextInt();

        KthLargestUsingPQ kth = new KthLargestUsingPQ();

        System.out.println(k+"th largest element in array/list = " + kth.find(nums, k));

    }
}
