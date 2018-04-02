/**
 * @author: Muktevigk
 *
 * Simple contact Book using Trie data structure.*/
package com.example.tree;

public class ContactBook {

    TrieNode root;
    ContactBook(){
        root = new TrieNode();
    }

    public void insertContact(String name){
        TrieNode curr = root;

        for(int i=0;i<name.length();i++){
            Character ch = name.charAt(i);
            TrieNode node = curr.children.get(ch-'a');
            if(node == null){
                node = new TrieNode();
                node.children.put(ch, node);
            }
            curr = node;
        }
    }


    public void getName(String prefix){
        TrieNode current = root;
        for (int i = 0;i<prefix.length();i++){
            Character ch = prefix.charAt(i);
            current = current.children.get(ch);
            System.out.println(current.children.values());
        }
    }
}
