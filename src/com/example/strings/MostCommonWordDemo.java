package com.example.strings;

public class MostCommonWordDemo {

    public static void main(String[] args) {
        String paragrap = "Bob hit a ball, the hit ball flew far away after it was hit";

        String banned [] = {"ball, hit"};

        MostCommonWord mostCommonWord = new MostCommonWord();

        String res = mostCommonWord.findMostCommon(paragrap, banned);

        System.out.println("res = " + res);
    }

}
