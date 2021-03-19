package oops.hash;

import oops.utils.PrintArray;

public class NumberOfBallons {

    int countMaxBallons(String text) {

        String compareString = "baloon";
        int res = 0;
        char[] count = new char[26];

        for (int i = 0; i < text.length(); i++) {
            // System.out.println(text.charAt(i)-'a');
            count[text.charAt(i) - 'a']++;
        }
        while(true){
            for (int i = 0; i < compareString.length(); i++) {
                if(count[compareString.charAt(i)-'a']-- <= 0){
                    return res;
                }
            }
            res++;
        }
    }

    int countBalloons(String text){

        int[] map=new int[26];
        for(char c:text.toCharArray()){
            map[c-'a']++;
        }
        return Math.min(
            map['b'-'a'], Math.min(map['a'-'a'], 
            Math.min(map['n'-'a'], 
            Math.min(map['l'-'a']/2, map['o'-'a']/2))));
    }

}
