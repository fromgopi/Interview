package com.example.leetcode.easy.strings;

import java.util.HashSet;

public class RemoveDuplicates {

    HashSet<String> remove(String s){
        HashSet<String> duplicates = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i='a';i<='z'; i++){
            sb.setLength(0);
            sb.append(i);
            duplicates.add(sb.toString());
        }

        int prevLength = -1;
        while (prevLength != s.length()) {
            prevLength = s.length();
            for (String d : duplicates) s = s.replace(d, "");
        }

        return duplicates;
    }
}
