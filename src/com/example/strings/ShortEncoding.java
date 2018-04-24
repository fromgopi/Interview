package com.example.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ShortEncoding {


    public int encodeIt(String words[]){

        Set<String> s = new HashSet<>(Arrays.asList(words));
        for (String w : words)
            for (int i = 1; i < w.length(); ++i)
                s.remove(w.substring(i));
        int res = 0;
        for (String w : s) res += w.length() + 1;
        return res;
    }

}
