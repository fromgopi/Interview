package com.example.leetcode.medium.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestStringChain {

    void checkLongest(String[] words){
        int ans=0;
        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        for (String word : words){
            set.add(word);
        }
        for (String word: words){
            ans = Math.max(ans, helper(map, set, word));
        }
        System.out.println(ans);
    }

    private int helper(Map<String, Integer> map, Set<String> set, String word) {
        if(map.containsKey(word)) return map.get(word);
        int cnt = 0;
        System.out.println("Word  -> " + word);
        for(int i = 0; i < word.length(); i++){
            String next = word.substring(0, i) + word.substring(i+1);
            System.out.println(next);
            if(set.contains(next)){
                cnt = Math.max(cnt, helper(map, set, next));
            }
        }
        map.put(word, 1 + cnt);
        return 1 + cnt;
    }

}
