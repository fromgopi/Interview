package com.example.strings;

public class CountAndSay {


    public String countAndSay(int n){
        StringBuilder str = new StringBuilder("1");
        int cur, i, cnt, len;
        char ptr;
        for(cur = 1; cur < n; cur++) {
            StringBuilder temp = new StringBuilder();
            for(i = 0, len = str.length(); i < len;) {
                for(ptr = str.charAt(i), cnt = 0; i < len && ptr == str.charAt(i); i++, cnt++);
                temp.append(cnt);
                temp.append(ptr);
            }
            str = temp;
        }
        return new String(str);
    }

    private String countAnd(String str) {

        StringBuilder sb = new StringBuilder();

        return "";
    }

}
