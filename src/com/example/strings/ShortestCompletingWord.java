package com.example.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ShortestCompletingWord {

    public String getShortestWord(String licensePlate, String[] words){
        String letters = licensePlate.replaceAll("[^A-Za-z]+", "").toLowerCase();
        System.out.println("letters = " + letters);
        String res = null;

        Map<Character, Integer> freq = new HashMap<Character, Integer>();
        for(char c : letters.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0) + 1);
        }

        Arrays.sort(words, lenComparator);
        for (String word : words){
            Map<Character, Integer> map = new HashMap<>();
            res = word;

            for(char ch : word.toCharArray()){
                map.put(ch, map.getOrDefault(ch, 0)+1);
            }

            if(map.size() < freq.size()){
                continue;
            }
            for(char abc : freq.keySet()){
                if(!map.containsKey(abc) || map.get(abc) < freq.get(abc)){
                    res = null;
                }
            }
            if(res != null){
                break;
            }
        }

        return res;
    }

    private Comparator<String> lenComparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    };


    public String getShortestUsingArray(String licensePlate, String[] words){
        int index = -1;
        int minLen = Integer.MAX_VALUE;

        int[] tar = new int[26];
        for (char c : licensePlate.toCharArray()) {
            if (Character.isDigit(c) || c == ' ')
                continue;
            tar[Character.toLowerCase(c) - 'a']++;
        }

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int[] arr = new int[26];
            for (char c : word.toCharArray())
                arr[c-'a']++;
            if (isValid(tar, arr)) {
                if (word.length() < minLen) {
                    minLen = word.length();
                    index = i;
                }
            }

        }

        return words[index];
    }

    public boolean isValid(int[] tar, int[] arr) {
        for (int i = 0; i < tar.length; i++) {
            if (arr[i] < tar[i])
                return false;
        }
        return true;
    }

}
