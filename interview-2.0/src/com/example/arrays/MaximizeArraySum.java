package com.example.arrays;

import java.util.PriorityQueue;

public class MaximizeArraySum {

    int maxSum(int[] array, int k){

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : array){
            pq.add(i);
        }

        System.out.println(pq);

        return 0;
    }
}
