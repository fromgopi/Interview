package com.example.arrays;

public class KthMissingEleDemo {

    public static void main(String[] args) {

        int[] array = {2,3,5,7};

        KthMissingElement kth = new KthMissingElement();

        System.out.println(kth.findMissing(array, 1));

    }
}
