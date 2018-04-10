package com.example.strings;

import java.util.List;

public class LongWordInDictDemo {

    public static void main(String[] args) {

        String words[] = {"w","wo","wor","worl", "world","a", "banana", "app", "appl", "ap", "apply", "apple"};

        LongWordInDict wordInDict = new LongWordInDict();

        System.out.println(wordInDict.findLongWord(words));
    }

}
