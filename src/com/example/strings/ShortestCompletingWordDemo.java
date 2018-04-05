/**
 * @Ref: leet-code number 748(Shortest Completing Word)
 * @author: Muktevigk
 * @params: String licensePlate, words[]
 * @return: 1st Occurrence of the words which match with licensePlate.
 */

package com.example.strings;

public class ShortestCompletingWordDemo {

    public static void main(String[] args) {
        String[] words = {"looks", "pest", "stew", "show"};
        String licensePlate = "1s3 456";

        ShortestCompletingWord shortestWord = new ShortestCompletingWord();
        String res = shortestWord.getShortestWord(licensePlate, words);
        System.out.println("res = " + res);

        String resArr = shortestWord.getShortestUsingArray(licensePlate, words);

        System.out.println("resArr = " + resArr);
    }

}
