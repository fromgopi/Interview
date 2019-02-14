package com.example.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    List<List<Integer>> calculateCombination(int[] candidates, int target){
        List<List<Integer>> list = new ArrayList<>();
        if(candidates.length == 0) {
            return list;
        }
        List<Integer> current = new ArrayList<Integer>();
        Arrays.sort(candidates);
        int i, pre = 0;
        backTrack(list, current, candidates, target, pre);
        return list;
    }

    private void backTrack(List<List<Integer>> list, List<Integer> current, int[] candidates, int target, int pre) {

        if (target == 0){
            list.add(new ArrayList<>(current));
            return;
        }

        int i = 0;
        while (i < candidates.length && target - candidates[i] >= 0){
            if(candidates[i] >= pre) {
                int save = pre;
                pre = candidates[i];
                target = target - candidates[i];
                current.add(candidates[i]);
                backTrack(list, current, candidates, target, pre);
                current.remove(current.size() - 1);
                target = target + candidates[i];
                pre = save;
            }
            i++;
        }
    }
}
