package com.example.dynamicprogramming;



public class FibonacciSeriesDemo {

    public static void main(String[] args) {

        int range = 50;

        FibonacciSeries fib = new FibonacciSeries();
        long st = System.currentTimeMillis();
        int resa = fib.fibSeriesRescursive(range);
        long et = System.currentTimeMillis();
        System.out.println("resa = " + resa + " In " + (et-st)+"MS");
        FibDP dp = new FibDP();
        long st1 = System.currentTimeMillis();
        int res = dp.fibDP(range);
        long et1 = System.currentTimeMillis();
        System.out.println("res = " + res + " In " + (et1-st1)+"MS");
    }


}
