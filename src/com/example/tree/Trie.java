package com.example.tree;

import java.util.Map;

public class Trie {

    TrieNode root;
    Trie(){
        root = new TrieNode();
    }

    public void insert(String word){
        TrieNode current = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch-'a');

            if(node == null){
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.endOfWord =true;
    }


    public void printTrie(){
        TrieNode current = root;

        for(int i : current.children.keySet()){
            System.out.println(current.children.get(i));
        }
    }

    public TrieNode searchNode(String str){
        TrieNode current = root;
        int len = str.length();
        for(int i=0;i<len;i++){
            char c = str.charAt(i);
            current = current.children.get(c);
            if(current == null){
                break;
            }
        }

        return current;
    }
}
