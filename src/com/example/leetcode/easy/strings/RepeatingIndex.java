package com.example.leetcode.easy.strings;

public class RepeatingIndex {


    void findIndex(String s) {
        char[] ch = s.toCharArray();
        int startIndex = -1;
        int count = 1;
        for (int i=0;i<s.length()-1;i++){
            if(ch[i] == ch[i+1]){
                if (startIndex == -1){
                    startIndex = i;
                }
                count++;
            }else {
                if(count > 1) {
                    System.out.println(startIndex + " " + count);
                    count = 1;
                    startIndex = -1;
                }
            }
        }
        if(count > 1) {
            System.out.println(startIndex + " " + count);
        }
    }
}
