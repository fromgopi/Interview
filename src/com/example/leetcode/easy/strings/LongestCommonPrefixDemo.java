package com.example.leetcode.easy.strings;

public class LongestCommonPrefixDemo {

    // Easy LC-14
    public static void main(String[] args) {

        String[] words = {"Flowers", "Flight", "Flow"};

        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.longCommonPrefix(words));


    }
}
