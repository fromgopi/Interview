package com.example.strings;

public class GoatLatinDemo {

    public static void main(String[] args) {
        String input = "I speak Goat Latin";

        GoatLatin goatLatin = new GoatLatin();
        System.out.println(goatLatin.toGoatLatin(input));
    }
}
