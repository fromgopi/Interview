package com.example.hackerank.arrays;

public class CompareTriplets {
    public void compare(int[] a, int[] b) {
        int aCounter = 0;
        int bCounter = 0;

        for (int i=0; i<a.length; i++){
            if(a[i] > b[i]){
                aCounter++;
            } else if(a[i] < b[i]){
                bCounter++;
            }
        }

        System.out.println("Alice Count is " + aCounter + ", Bob Count is " + bCounter);
    }
}
