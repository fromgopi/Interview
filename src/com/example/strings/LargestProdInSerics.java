package com.example.strings;

public class LargestProdInSerics {

    public void findPrd(String num, int range){

        int largestProduct = 0;

        for (int i = 0; i < num.length() - range; i ++) {
            int product = 1;

            for (int j = i; j < i + range; j++) {
                product *= Integer.parseInt(num.substring(j, j + 1));
            }
            if (product > largestProduct) {
                largestProduct = product;
            }
        }
        System.out.println(largestProduct);

    }

}
