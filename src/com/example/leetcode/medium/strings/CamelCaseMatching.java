package com.example.leetcode.medium.strings;

import java.util.ArrayList;
import java.util.List;

public class CamelCaseMatching {

    List<Boolean> camelMatch(String[] queries, String pattern){
        List<Boolean> res = new ArrayList<>();

        for (String query : queries){
            res.add(check(query, pattern));
        }

        return res;
    }

    private Boolean check(String query, String pattern) {
        int i = 0;
        for (char ch : query.toCharArray()){
            if (i < pattern.length() && ch == pattern.charAt(i)){
                ++i;
            }else if ('A' <= ch && ch <= 'Z') {
                return false;
            }
        }
        return i == pattern.length();
    }
}
