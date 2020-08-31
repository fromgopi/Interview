package com.example.arrays;

import java.util.Deque;
import java.util.LinkedList;

public class MaxHistogramArea {

    int maxHistogramArea(int[] input) {
        Deque<Integer> stack = new LinkedList<Integer>();
        int maxArea = 0, tempArea = 0;
        for (int i = 0; i < input.length;) {
            System.out.println("Peek First = " + stack.peekFirst() + " and index = " + i + " value of "+i+ " is " + input[i]);
            if(stack.isEmpty() || input[stack.peekFirst()] <= input[i]){
                System.out.println("Checking condition for stack empty and pushing " + i + "th index into stack");
                stack.offerFirst(i++);
            } else {
                int top = stack.pollFirst();
                System.out.println("Top of the stack is " + top);
                if (stack.isEmpty()){
                    System.out.println("Inside else if and calculating tempArea");
                    tempArea = input[top] * i;
                    System.out.println("TempArea is " + tempArea);
                } else {
                    System.out.println("Inside else else case calculating tempArea");
                    tempArea = input[top] * (i - stack.peekFirst() - 1);
                    System.out.println("TempArea is " + tempArea);
                }
                if( tempArea > maxArea){
                    System.out.println("Condition for changing max Area");
                    maxArea = tempArea;
                    System.out.println("MaxArea is " + maxArea);
                }
            }
        }
        return maxArea;
    }
}
