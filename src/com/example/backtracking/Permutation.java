package com.example.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permutation {

    int permutation(int[] nums){
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (nums.length ==0) return ans.size();
        List<Integer> l0 = new ArrayList<Integer>();
        l0.add(nums[0]);
        ans.add(l0);
        for (int i = 1; i< nums.length; ++i){
            List<List<Integer>> new_ans = new ArrayList<List<Integer>>();
            for (int j = 0; j<=i; ++j){
                for (List<Integer> l : ans){
                    List<Integer> new_l = new ArrayList<Integer>(l);
                    new_l.add(j,nums[i]);
                    new_ans.add(new_l);
                }
            }
            ans = new_ans;
        }
        return ans.size();
    }
}
