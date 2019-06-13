package com.example.leetcode.easy.strings;

public class ConvertArrayToStrings {
    void convert(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String a : words){
            sb.append(a);
        }

        String [] ans = new String[words.length];
        int index = 0;
        int lastIndex = 0;
        for (int i = 1; i < sb.length(); i++) {
            if(Character.isUpperCase(sb.charAt(i))) {
                ans[index++] = sb.substring(lastIndex,i);
                lastIndex = i;
            }
        }
        ans[index] = sb.substring(lastIndex);
    }
}
