package com.example.strings;

public class ReverseStringFromPos {

    private boolean check = false;

    public String reverse(String s, int k){

        char ch[] = s.toCharArray();
        int i=0;

        while(!check){
            reverseStr(i, i+k-1, ch);
            i = 2*k;
        }

        return new String(ch);
    }

    private void reverseStr(int from, int to, char[] ch) {
        int start = from;
        int end = to;

        if(end >= ch.length){
            check = true;
            end = ch.length-1;
        }

        while (start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }

}
