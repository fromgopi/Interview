package com.example.strings;

public class GoatLatin {

    public String toGoatLatin(String S){
        String[] words = S.split(" ");
        StringBuilder suffix = new StringBuilder("a");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char firstChar = word.charAt(0);
            if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u'
                    || firstChar == 'A' || firstChar == 'E' || firstChar == 'I' || firstChar == 'O'
                    || firstChar == 'U') {
                if (i > 0)
                    result.append(" ");
                result.append(word).append("ma").append(suffix);
            } else {
                if (i > 0)
                    result.append(" ");
                result.append(word.substring(1)).append(firstChar).append("ma").append(suffix);
            }
            suffix.append('a');
        }
        return result.toString();
    }
}
