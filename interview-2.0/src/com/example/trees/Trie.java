package com.example.trees;

public class Trie {

    Node rootNode;

    public Trie() {
        rootNode = new Node('0');
    }

    /**
     * Function to insert word into prefix tree.
     * @param word: String to insert into prefix tree.
     */
    public void insertWord(String word){
        Node currentNode = rootNode;
        Node tempNode;
        System.out.println(word);

        for (char ch : word.toCharArray()){
            if(currentNode.children[ch - 'a'] == null) {
                System.out.println("Checking " + ch + " is in the prefix tree");
                tempNode = new Node(ch);
                currentNode.children[ch-'a'] = tempNode;
            }
            currentNode = currentNode.children[ch - 'a'];
        }
        currentNode.isLast = true;
    }
}