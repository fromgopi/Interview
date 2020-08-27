package com.example.strings;

public class AlternatingCharacters {

    int solution(String s){
        int count = 0;
        if (s == null){
            return 0;
        }
        int len = s.length();
        for (int i = 0; i < len-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            }
        }
        return count;
    }
}
