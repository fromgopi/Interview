package com.example.strings;

import java.util.*;

public class TopKFrequentWords {

    List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> map = new HashMap<>();
        for(String word : words){
            Integer wordOccurrence = map.get(word);
            if(wordOccurrence == null){
                map.put(word, 1);
            }else {
                map.put(word, wordOccurrence + 1);
            }
        }

        Queue<Map.Entry<String, Integer>> queue = new PriorityQueue<>(
                (a,b) -> {
                    if(a.getValue() > b.getValue()) {
                        return -1;
                    } else if(a.getValue() < b.getValue()) {
                        return 1;
                    } else {
                        return a.getKey().compareTo(b.getKey());
                    }
                }
        );
        queue.addAll(map.entrySet());

        List<String> result = new ArrayList<>(k);
        for(int i = 0; i < k ; i++ ) {
            result.add(queue.poll().getKey());
        }

        return result;
    }
}
