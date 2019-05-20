package com.example.leetcode.medium.strings;

public class LongestStringChainDemo {

    // LC-1048

    public static void main(String[] args) {

        String[] words = {"a","b","ba","bca","bda","bdca"};

        LongestStringChain lsc = new LongestStringChain();
        lsc.checkLongest(words);
    }

}
