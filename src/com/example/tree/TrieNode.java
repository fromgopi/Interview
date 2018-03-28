package com.example.tree;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    char letter;
    Map<Character, TrieNode> children;
    boolean endOfWord;

    TrieNode(){
        children = new HashMap<>();
        endOfWord = false;
    }
}
