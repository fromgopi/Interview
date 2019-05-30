package com.example.leetcode.medium.arrays;

public class MergeIntervalsDemo {

    public static void main(String[] args) {

        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

        MergeIntervals mi = new MergeIntervals();

        System.out.println(mi.merge(intervals));
    }
}
