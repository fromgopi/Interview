package com.example.arrays;

public class KthMissingElement {

    int findMissing(int[] list, int num){
        int k = 0, val = 0;
        if(list.length < 2){
            return -1;
        }
        val = list[0];
        for(int i = 0; i < list.length - 1; val = list[++i])
            while((list[i + 1] - val++) > 1)
                if(k++ == num){
                    System.out.println("val = " + val);
                    return val;
                }
        return -1;
    }

}
