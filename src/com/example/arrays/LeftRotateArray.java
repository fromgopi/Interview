package com.example.arrays;

public class LeftRotateArray {

    public int[] rotate(int[] a, int n, int k){

        int temp, i, j;
        for(i=0;i<k;i++){
            temp = a[0];
            for(j=1;j<n;j++){
                a[j-1] = a[j];
            }
            a[n-1] = temp;
        }
        return a;
    }


    private void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }

}
