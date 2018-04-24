package com.example.backtracking;

public class SubSetDemo {

    public static void main(String[] args) {
        int nums[] = {1,2,3};

        SubSet ss = new SubSet();

        System.out.println(ss.findSubSet(nums));
    }

}
