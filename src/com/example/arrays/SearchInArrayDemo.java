package com.example.arrays;

import java.util.Random;
import java.util.Scanner;

public class SearchInArrayDemo {

    public static void main(String[] args) {

        //int nums[] = {1,1,3,4,5,2,21,2,32,9};

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        //int temp[] = new int[];

        System.out.println("Enter the lenght of array\n");
        int p = sc.nextInt();
        int a[] = new int [p];
        for(int i=0;i<a.length;i++){
            a[i] = r.nextInt(p);
        }
        SearchInArray search = new SearchInArray();
        long st = System.currentTimeMillis();
        System.out.println(search.search(a, 77));
        long et = System.currentTimeMillis();
        System.out.println("et-st = " + (et-st));
    }

}
