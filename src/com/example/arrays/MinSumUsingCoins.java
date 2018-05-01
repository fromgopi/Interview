package com.example.arrays;

public class MinSumUsingCoins {

    int findSum(int[] array){

        int minSum = 1;
        for (int i=0;i<array.length;i++){
            if(minSum < array[i]){
                return minSum;
            }else {
                minSum += array[i];
            }
        }
        return minSum;
    }

}
