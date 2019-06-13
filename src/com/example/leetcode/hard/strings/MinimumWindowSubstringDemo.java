package com.example.leetcode.hard.strings;

public class MinimumWindowSubstringDemo {

    // LC-76

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        MinimumWindowSubstring mws = new MinimumWindowSubstring();

        System.out.println(mws.minWindow(s,t));

    }
}
