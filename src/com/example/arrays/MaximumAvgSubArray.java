package com.example.arrays;

public class MaximumAvgSubArray {

    public double findAvg(int array[], int k){
        long sum = 0;

        for (int i=0; i<k; i++){
            sum += array[i];
        }
        long max = sum;

        for(int i = k; i<array.length; i++){
            sum += array[i] - array[i-k];
            max = Math.max(max, sum);
        }

        return max / 1.0 / k;
    }

}
