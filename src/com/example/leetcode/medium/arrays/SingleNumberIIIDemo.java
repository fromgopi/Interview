package com.example.leetcode.medium.arrays;

public class SingleNumberIIIDemo {

    public static void main(String[] args) {

        // Medium LC-260

        int[] nums = {1,2,1,3,2,5};

        SingleNumberIII sn = new SingleNumberIII();

        printResult(sn.singleMatch(nums));

    }

    private static void printResult(int[] singleMatch) {
        for (int i=0;i<singleMatch.length;i++){
            System.out.print(singleMatch[i] + ",");
        }
        System.out.println();
    }
}
