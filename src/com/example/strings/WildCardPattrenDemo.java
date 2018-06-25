package com.example.strings;

public class WildCardPattrenDemo {

    public static void main(String[] args) {
        String inputString = "helloworld";
        String pattern = "he^low^ld";

        int res = getWildCardLength(inputString, pattern);
        if(res % 2 == 0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }


    }

    private static int getWildCardLength(String inputString, String pattern) {

        if (pattern.length() > inputString.length()) {
            return 0;
        }
        int i=0,j=0;
        char[] inputStringArray = inputString.toCharArray();
        char[] patternArray = pattern.toCharArray();
        int count = 0;
        int charCount =0;
        for (int k=0; k<pattern.length();k++) {
            if (patternArray[k] == '^'){
                charCount++;
            }
        }
        if (charCount == 1) {
            return inputStringArray.length - (patternArray.length -1);
        }
        while (i < inputString.length()) {
            if (inputStringArray[i] == patternArray[j] ){
                i++;
                j++;
            } else {
                if (j == pattern.length() -1) {
                    return count+(inputStringArray.length-i);
                }
                while (inputStringArray[i] != patternArray[j+1]) {
                    count++;
                    if (i < inputStringArray.length) {
                        i++;
                    } else {
                        return 0;
                    }
                }
                count = 0;
                if (i == inputStringArray.length) {
                    i++;
                }
                j++;
            }
        }
        return count;
    }
}
