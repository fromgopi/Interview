package com.example.arrays;

import java.util.Random;

public class MatrixDemos {

    public static void main(String[] args) {

        int a[][] = {{1,2,3},{2,3,4},{3,4,5}};

        for (int i=0; i<a.length;i++){
            for (int j=0;j<a.length;j++){
                System.out.println(j + " -> " + a[i][j]);
            }
        }

    }
}
