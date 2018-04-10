package com.example.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongWordInDict {

    public String findLongWord(String[] words){

        Arrays.sort(words);

        Set<String> set = new HashSet<String>();
        String res = "";
        for (String word : words){
            if(word.length() == 1 || set.contains(word.substring(0, word.length()-1))){
                res = word.length() > res.length() ? word:res;
                set.add(word);
    //            System.out.println("set.iterator().next() = " + set.iterator().next());
            }
        }
        return res;
    }


    public void findWord(String[] words){
        Trie trie = new Trie();

        for (String word : words){
            trie.addWord(word);
        }

    }


}
