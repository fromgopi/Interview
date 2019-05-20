package com.example.leetcode.medium.strings;

import java.util.List;

public class GroupAnagramsDemo {

    // LC-49
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        GroupAnagrams ga = new GroupAnagrams();
        List<List<String>> res = ga.groupAnagrams(strs);
        System.out.println(res);
    }
}
