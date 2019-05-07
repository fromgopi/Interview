package com.example.arrays;

public class NonRepPermutationsDemo {

    public static void main(String[] args) {

        int [] nums = {1,1,2};

        NonRepPermutations nrp = new NonRepPermutations();
        System.out.println(nrp.permuteUnique(nums));
    }
}
