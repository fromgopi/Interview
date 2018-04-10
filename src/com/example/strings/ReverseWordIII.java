package com.example.strings;

public class ReverseWordIII {


    public void reverseIII(String s){

        String[] str = s.split(" ");

        for (int i=0; i<str.length; i++){
            str[i] = new StringBuilder(str[i]).reverse().toString();
        }

        StringBuilder stringBuilder = new StringBuilder();

        for(String word : str){
            stringBuilder.append(word + " ");
        }

    }

}
