package com.example.strings;

public class PermutationInStringDemo {

    public static void main(String[] args) {

        String str = "abc";

        PermutationInString per = new PermutationInString();

        per.findPerm(str, 0, str.length()-1);

    }
}
