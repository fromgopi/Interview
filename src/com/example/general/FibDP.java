package com.example.general;

public class FibDP {

    public int fibDP(int range){

        int[] resFib = new int[range + 1];

        resFib[0] = 0;
        resFib[1] = 1;

        for(int i=2; i< range+1; i++){
            resFib[i] = resFib[i-1] + resFib[i-2];
        }

        return resFib[range];
    }

}
