package com.example.leetcode.hard.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubstringWithContact {

    public List<Integer> findSubstring(String s, String[] words){
        return find(s, 0, words);
    }

    private List<Integer> find(String s, int index, String[] words) {

        List<Integer> result = new ArrayList<>();

        if(words.length != 0) {

            int wordLength = words[0].length();
            int totalWordsLength = wordLength * words.length;
            if (s.length() - index >= totalWordsLength) {
                String subStr = s.substring(index, index + totalWordsLength);
                List<String> wordList = new ArrayList<String>(Arrays.asList(words));
                for (int i = 0; i < subStr.length(); i++) {
                    String word = subStr.substring(i, i + wordLength);
                    if (!wordList.contains(word)) break;
                    wordList.remove(word);
                    i += wordLength - 1;
                }
                if (wordList.size() == 0) {
                    result.add(index);
                }

            }
        }
        return result;
    }
}
