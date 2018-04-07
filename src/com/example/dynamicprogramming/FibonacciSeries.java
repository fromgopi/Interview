package com.example.dynamicprogramming;

public class FibonacciSeries {

    public int fibSeriesRescursive(int range){

        if(range == 0){
            return 0;
        }

        if(range == 1){
            return 1;
        }else {
            int fib = fibSeriesRescursive(range - 1) + fibSeriesRescursive(range -2 );
            return fib;
        }
    }

}
