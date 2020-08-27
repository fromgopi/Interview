package com.example.trees;

/**
 * Basic data structure
 */
public class Node {
    char letter;
    Node [] children;
    boolean isLast = false;

    public Node(char ch) {
        this.letter = ch;
        this.children = new Node[26];

    }
}
