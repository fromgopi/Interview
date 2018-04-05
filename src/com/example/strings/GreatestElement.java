package com.example.strings;

public class GreatestElement {


    public char getGreatestElement(char[] letters, char target){

        int end = letters.length - 1;
        if (target >= letters[end]) {
            return letters[0];
        }
        int start = 0;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (letters[start] > target) {
            return letters[start];
        } else {
            return letters[end];
        }
    }

}
