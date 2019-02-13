package com.example.arrays;

public class RotateMat {

    void rotate(int [][] mat, int N){
        int len = N;

        for (int i=0;i<len/2;i++){
            for (int j=i; j<len-i-1;j++){
                System.out.println(j);
            }
        }
    }
}
