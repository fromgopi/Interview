package oops.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SortFeaturesByPopularity {

    public String[] solution(String[] features, String[] response) {
        Map<String, Integer> map = new HashMap<>();
        for(String word : features){
            map.put(word, 0);
        }
        map(map, response);
        Arrays.sort(features, (e1, e2) -> map.get(e2) - map.get(e1));
        return features;
    }

    private void map(Map<String, Integer> map, String[] response) {
        for(String word: response){
            String[] words = word.split(" ");
            Set<String> visited = new HashSet<>();
            for (String w : words) {
                if(map.containsKey(w) && !visited.contains(w)){
                    map.put(w, map.get(w)+1);
                    visited.add(w);
                }
            }
        }
    }
}