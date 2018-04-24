package com.example.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Combination {

    List<List<Integer>> findCombination(int n, int k){
        if(n == 0 || k == 0 || k > n){
            return Collections.emptyList();
        }
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        for (int i = 1; i <= n+1-k ; i++) {
            res.add(Arrays.asList(i));
        }

        for (int i = 2; i <= k; i++) {
            List<List<Integer>> tmp = new ArrayList<List<Integer>>();
            for(List<Integer> list : res){
                for (int m = list.get(list.size() - 1) + 1; m <= n - (k - i); m++){
                    List<Integer> newList = new ArrayList<Integer>(list);
                    newList.add(m);
                    tmp.add(newList);
                }
            }
            res = tmp;
        }

        return res;

    }

}
