package com.example.leetcode.easy.strings;

public class LongestCommonPrefix {

    String longCommonPrefix(String[] strs){
        if ((strs == null) || strs.length == 0){
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int length = strs[0].length();
        char ch;
        for (int i = 0; i < length; i++) {
            ch = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(strs[j].length()-1 < i || strs[j].charAt(i) != ch){
                    return sb.toString();
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
