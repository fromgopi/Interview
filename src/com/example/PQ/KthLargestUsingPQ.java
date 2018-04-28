package com.example.PQ;

import java.util.PriorityQueue;

public class KthLargestUsingPQ {

    public int find(int[] nums, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : nums){
            pq.offer(i);

            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
