package com.example.strings;

import java.util.HashSet;
import java.util.Set;

public class TwoStrings {

    public String solution(String s1, String s2){
        Set<Character> charSet1 = toChatSet(s1);
        Set<Character> charSet2 = toChatSet(s2);
        charSet1.retainAll(charSet2);

        if (charSet1.size() > 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

    private Set<Character> toChatSet(String s1) {
        Set<Character> charSet = new HashSet<Character>();
        for (int i = 0; i < s1.length(); i++) {
            charSet.add(s1.charAt(i));
            System.out.println(charSet);
        }

        return charSet;
    }
}
