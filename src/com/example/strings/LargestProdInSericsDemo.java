//Hackerrank ProjectEuler 8.
package com.example.strings;

public class LargestProdInSericsDemo {

    public static void main(String[] args) {
        String num = "2709360626";
        int range=5;

        LargestProdInSerics prd = new LargestProdInSerics();
        prd.findPrd(num, range);
    }
}
