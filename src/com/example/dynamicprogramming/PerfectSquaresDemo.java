package com.example.dynamicprogramming;

import com.example.general.PerfectSquare;

public class PerfectSquaresDemo {

    public static void main(String[] args) {

        int n = 13;

        PerfectSquares ps = new PerfectSquares();
        System.out.println("ps = " + ps.findMinSquare(310));
    }

}
