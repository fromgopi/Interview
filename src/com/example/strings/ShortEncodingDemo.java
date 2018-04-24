package com.example.strings;

public class ShortEncodingDemo {

    public static void main(String[] args) {
        String words[] = {"Time", "bell", "me"};

        ShortEncoding enc = new ShortEncoding();

        System.out.println(enc.encodeIt(words));
    }

}
