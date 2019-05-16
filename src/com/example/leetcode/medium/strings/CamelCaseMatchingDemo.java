package com.example.leetcode.medium.strings;

public class CamelCaseMatchingDemo {

    public static void main(String[] args) {
        // Medium LC-1023

        String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String pattern = "FB";

        CamelCaseMatching ccs = new CamelCaseMatching();

        System.out.println(ccs.camelMatch(queries, pattern));
    }

}
