package com.example.leetcode.hard.strings;

public class MinimumWindowSubstring {

    String minWindow(String s, String t){

        int[] target = new int[58];
        for(char c : t.toCharArray()) {
            target[c - 'A']++;
        }
        int[] current = new int[58];

        int resI = -1;
        int resJ = s.length();

        int i = 0;
        int j = 0;
        while(j < s.length()) {
            current[s.charAt(j) - 'A']++;
            while(checkInclude(current, target) && i <= j) {
                if(j - i< resJ - resI) {
                    resI = i;
                    resJ = j;
                }
                current[s.charAt(i) - 'A']--;
                i++;
            }
            j++;
        }

        if(resI == -1) return "";
        return s.substring(resI, resJ + 1);
    }

    private boolean checkInclude(int[] current, int[] target) {
        for(int i = 0; i < 58; i++) {
            if(current[i] < target[i]) return false;
        }
        return true;
    }
}
