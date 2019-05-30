package com.example.leetcode.medium.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length == 0){
            System.out.println("Invalid");
        }
        List<int[]> result = new ArrayList<>();

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int start = intervals[0][0];
        int end = intervals[0][1];

        System.out.println("start -> " + start + ", End -> " + end);
        for (int i = 0; i < intervals.length; i++) {
            if( end >= intervals[i][0]){
                if(end >= intervals[i][1]){
                    end = intervals[i][1];
                }
            } else {
                int[] temp = {start, end};
                result.add(temp);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        int[] temp = { start, end };
        result.add(temp);
        int[][] res = new int[result.size()][];
        return result.toArray(res);
    }
}
