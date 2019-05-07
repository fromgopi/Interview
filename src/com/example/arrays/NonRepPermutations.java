package com.example.arrays;

import java.util.*;

public class NonRepPermutations {

    public List<List<Integer>> permuteUnique(int [] nums){

        List<List<Integer>> result = new ArrayList<>();

        for (int num: nums){
            if(result.size() == 0){
                result.add(new ArrayList<Integer>(Arrays.asList(num)));
            }else {
                Set<List<Integer>> resSet = new HashSet<>();
                for (List<Integer> list : result){
                    for (int i = 0; i <= list.size(); i++) {
                        ArrayList<Integer> newList = new ArrayList<>(list);
                        newList.add(i, num);
                        resSet.add(newList);
                    }
                }
                result = new ArrayList<List<Integer>>(resSet);
            }
        }

        return result;
    }

    public List<List<Integer>> permuteUniquee(int[] num){
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(num);

        return result;
    }


}
