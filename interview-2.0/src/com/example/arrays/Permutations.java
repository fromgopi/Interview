package com.example.arrays;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    void findPermute(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        helper(result, nums);
        System.out.println(result);
    }

    private void helper(List<List<Integer>> result, int[] nums){
        List<Integer> temp = new ArrayList<>();

        if(temp.size() == nums.length){
            result.add(temp);
        }
    }
}
