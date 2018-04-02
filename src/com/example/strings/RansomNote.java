package com.example.strings;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    boolean isValid;

    public void checkRansomNote(String magazine, String note){

        magazineMap = new HashMap<String, Integer>();
        isValid = true;

        for(String word : magazine.split(" ")){
            Integer count = magazineMap.get(word);

            if(count == null){
                magazineMap.put(word, 1);
            }else{
                magazineMap.put(word, count+1);
            }
        }

        for(String word : note.split(" ")){
            Integer count = magazineMap.get(word);

            if(count == null || magazineMap.get(word) == 0){
                isValid = false;
                System.out.println("There is no valid match.");
                break;
            }
            magazineMap.put(word, count-1);
        }

        System.out.println("Magazine after searching the note and status of Note is --> " + isValid);
        System.out.println("[Key, Val] -> " + magazineMap.keySet()+","+magazineMap.values());
    }
}
