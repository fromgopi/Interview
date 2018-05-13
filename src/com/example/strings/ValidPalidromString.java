package com.example.strings;

public class ValidPalidromString {

    boolean findValidPalidrom(String s){
        if(s == null || s.length() == 0)
            return true;

        for(int i=0, j=s.length()-1; i<=s.length()/2; i++, j--){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                j++;
                continue;
            }else if(!Character.isLetterOrDigit(s.charAt(j))){
                i--;
                continue;
            }else if(Character.toLowerCase(s.charAt(i))!= Character.toLowerCase(s.charAt(j))){
                return false;
            }
        }
        return true;
    }

}
