package com.example.strings;

import java.util.Arrays;

public class CanFormPalidrom {


    void canFormPalidrom(String a){

        int count[] = new int[256];

        Arrays.fill(count, 0);

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            count[ch]++;
        }

        int odd = 0;
        for (int i = 0; i < count.length; i++) {
            if ((count[i] & 1) == 1) {
                odd++;
            }

        }
        if (odd > 1) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }

    }

}
