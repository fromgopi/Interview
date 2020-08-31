package com.example.strings;

public class TopKFrequentWordsDemo {

    public static void main(String[] args) {

//        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};

        TopKFrequentWords obj = new TopKFrequentWords();

        System.out.println(obj.topKFrequent(words, 4));

    }
}
