package com.example.arrays;

public class MinMoves {

	int move(int[] a){
		int sum  = 0;
        int min = Integer.MAX_VALUE;
        int len = a.length;
        for (int i = 0; i < len; i++) {
            sum += a[i];
            min = Math.min(min, a[i]);
            System.out.println("Sum = " + sum + ", array = " + a[i] + ", min = " + min);
        }
        
        return sum - min * len;
	}
}
