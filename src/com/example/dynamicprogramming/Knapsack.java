package com.example.dynamicprogramming;

import java.util.Arrays;

public class Knapsack {

    public static void main(String[] args) {
        int w = 10;
        int n = 4;

        PrintArray pa = new PrintArray();
        int[] val = {10, 40, 30, 50};
        int[] wt = {5, 4, 6, 3};

        int[][] mat = new int[n + 1][w + 1];

        for (int r = 0; r < w + 1; r++) {
            mat[0][r] = 0;
        }
        for (int c = 0; c < n + 1; c++) {
            mat[c][0] = 0;
        }

        for(int item =1; item<=n; item++){
            for (int cap=1; cap<=w; cap++){
                int maxValWithoutCurr = mat[item-1][cap];
                System.out.println("Max value without Current -> " + maxValWithoutCurr);
                int maxValWithCurr = 0;
                System.out.println("Max value with Current -> " + maxValWithCurr);
                int weightOfCurr = wt[item - 1];
                System.out.println("Weight of Current object -> " + weightOfCurr);
                System.out.println("Checking if knapsack fits the current object..");
                if(cap >= weightOfCurr){
                    maxValWithCurr = val[item-1];
                    System.out.println("If so maxValWithCurr, " + maxValWithCurr + "is at least the value of the current item");
                    int remaingCapacity = cap - weightOfCurr;
                    System.out.println("Remaing Capacity of the sack -> " + remaingCapacity);
                    System.out.println("Add the maximum value obtainable with the remaining capacity");
                    maxValWithCurr += mat[item-1][remaingCapacity];
                }

                mat[item][cap] = Math.max(maxValWithoutCurr, maxValWithCurr);
            }
        }
        pa.print(mat);

        System.out.println(Arrays.deepToString(mat));
    }
}
