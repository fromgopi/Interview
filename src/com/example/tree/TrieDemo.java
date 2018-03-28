package com.example.tree;

public class TrieDemo {

    public static void main(String[] args) {
        Trie t = new Trie();

        t.insert("gopi");
        t.insert("google");
        t.insert("god");
        t.insert("good");

        t.printTrie();
    }

}
