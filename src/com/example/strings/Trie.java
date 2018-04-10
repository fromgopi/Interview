package com.example.strings;

public class Trie {

    TrieNode root;

    Trie(){
        root = new TrieNode();
        root.word = "";
    }

    public void addWord(String word){

        TrieNode current = root;
        for(char ch : word.toCharArray()){
            if(current.children[ch - 'a'] == null){
                current.children[ch - 'a'] = new TrieNode();
                current = current.children[ch - 'a'];
            }
            current.word = word;
        }
    }

    public void search(String pattern){
        
        TrieNode current = root;
        
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            if(current.children[ch - 'a'] != null){
                System.out.println("ch = " + ch);
            }
        }
        
    }

}
