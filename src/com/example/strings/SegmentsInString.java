package com.example.strings;

public class SegmentsInString {


    public int findSegments(String s){

        int res = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i-1) == ' ')){
                res ++;
            }
        }
        return res;

    }
}
