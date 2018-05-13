package com.example.strings;

public class FindAndReplaceDemo {

    public static void main(String[] args) {

        FindAndReplace findAndReplace = new FindAndReplace();

        String s = "abcd";
        int[] index = {0, 2};
        String[] sources = {"a", "cd"};
        String[] targets = {"eeeee", "fffff"};

        findAndReplace.find(s, index, sources, targets);
        findAndReplace.find(s, sources, targets, index);
    }

}
