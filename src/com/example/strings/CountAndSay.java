package com.example.strings;

public class CountAndSay {


    public String countAndSay(int number){
        String str = "1";
        while (--number > 0){
            str = countAnd(str);
        }

        return " ";
    }

    private String countAnd(String str) {

        StringBuilder sb = new StringBuilder();

        return "";
    }

}
