package com.example.dynamicprogramming;

public class LongestValidParenthesesDemo {

    public static void main(String[] args) {

        String parentheses = "(()())())";

        LongestValidParentheses valid = new LongestValidParentheses();

        valid.checkValidCount(parentheses);
    }

}
