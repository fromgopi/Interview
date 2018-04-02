/**
 * @author: Muktevigk.
 * @params: Full String T, pattern String P
 * @return: returns the index where the pattern is found.
 */
package com.example.strings;

public class SubStringNaive {

    public int check(String T, String P){
        int textLength = T.length();
        int patLength = P.length();
        int count=0;
        for(int i=0;i<=textLength-patLength;i++){
            int j;

            for(j=0;j<patLength;j++){
                if(T.charAt(i+j) != P.charAt(j)){
                    break;
                }
            }
            if(j == patLength){
                count++;
            }
        }

        return count;
    }

}
