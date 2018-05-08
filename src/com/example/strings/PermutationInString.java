package com.example.strings;

public class PermutationInString {

    void findPerm(String str, int startIndex, int endIndex){

        char[] words = str.toCharArray();
        if (startIndex == endIndex){
            System.out.println(String.valueOf(words));
        }else{
            for (int i=startIndex; i<endIndex;i++){
                swap(words, startIndex, i);
                findPerm(str, startIndex+1, endIndex);
                swap(words, startIndex, i);
            }
        }
    }

    private void swap(char[] words, int startIndex, int i) {
        char temp = words[startIndex];
        words[startIndex] = words[i];
        words[i] = temp;
    }
}
