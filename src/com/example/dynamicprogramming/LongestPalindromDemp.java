package com.example.dynamicprogramming;


public class LongestPalindromDemp {

    public static void main(String[] args) {

        String str = "aaabbabbababababa";

        LongestPalindromUsingDP dp = new LongestPalindromUsingDP();

        System.out.println(dp.findPalindrom(str));

    }
}
