package com.example.strings;

import java.util.HashMap;

public class LongestSubStringWithoutDups {

    void findSubString(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int max = 0;
        for(int i=0; i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int dup = map.get(s.charAt(i));
                if(start <= dup){
                    map.remove(s.charAt(i));
                    start++;
                }
                start = dup+1;
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, map.size());
        }
        System.out.println(max);
    }

    void findsubString(String s){
        int n = s.length();
        int ans = 0;
        int index[] = new int[128];
        for(int j=0, i=0; j<n; j++){
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j-i+1);
            index[s.charAt(j)] = j+1;
        }
        System.out.println(ans);
    }

}
