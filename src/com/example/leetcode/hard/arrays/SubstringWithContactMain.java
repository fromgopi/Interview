package com.example.leetcode.hard.arrays;

public class SubstringWithContactMain {

    public static void main(String[] args) {

        SubstringWithContact sbc = new SubstringWithContact();

        String s = "barfoothefoobarman";
        String[] words = {"foo","bar"};

        System.out.println(sbc.findSubstring(s, words));

    }
}
