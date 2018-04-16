package com.example.strings;

import java.util.ArrayList;
import java.util.List;

public class FindAnagrams {

    public List<Integer> findAnagrams(String s, String p){
        int chars[] = new int[26];
        List<Integer> result = new ArrayList<>();

        if(s == null || p == null ||  s.length() < p.length()){
            return result;
        }

        for(char ch : p.toCharArray()){
            chars[ch - 'a']++;
        }

        int start = 0, end = 0, count = p.length();
        while (end < s.length()) {
            if (end - start == p.length() && chars[s.charAt(start++)-'a']++ >= 0)
                count++;
            if (--chars[s.charAt(end++)-'a'] >= 0)
                count--;
            if (count == 0)
                result.add(start);
        }

        return result;
    }
}
