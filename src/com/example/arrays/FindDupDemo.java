package com.example.arrays;

public class FindDupDemo {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,5};

        FindDupInArray dup = new FindDupInArray();

        System.out.println("dup = " + dup.findDup(array));

    }
}
