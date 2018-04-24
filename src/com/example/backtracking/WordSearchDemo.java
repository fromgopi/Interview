package com.example.backtracking;

public class WordSearchDemo {

    public static void main(String[] args) {
        char[][] board = { {'A','B','C','E'},
                           {'S','F','C','S'},
                           {'A','D','E','E'} };

        String word = "Gopi";

        WordSearch ws = new WordSearch();
        System.out.println("ws.search(board, word) = " + ws.searchWord(board, word));
    }
}
