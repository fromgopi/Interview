package com.example.arrays;

public class CombinationSumDemo {

    public static void main(String[] args) {
        int[] candidates = {2,3,5};

        int target  = 8;

        CombinationSum combinationSum = new CombinationSum();
        System.out.println(combinationSum.calculateCombination(candidates, target));
        CombinationTwo combinationTwo = new CombinationTwo();
        System.out.println("2nd Combination");
        System.out.println(combinationTwo.combinationSum2(candidates, target));

    }
}
