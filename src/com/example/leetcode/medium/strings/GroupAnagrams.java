package com.example.leetcode.medium.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null||strs.length==0){
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();
        for(String word: strs){
            int[] count = new int[26]; //will be init 0
            for(char c: word.toCharArray()){
                System.out.println("c -> "+ c + " c-'a' -> " + (c-'a'));
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<count.length;i++){
                sb.append(count[i]);
            }
            String hash = sb.toString();
            if(!map.containsKey(hash)){
                map.put(hash, new ArrayList<String>());
            }
            map.get(hash).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
