package com.example.backtracking;

import java.util.Random;
import java.util.Scanner;

public class JumpHurdleDemo {

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of track");
        int n = sc.nextInt();
        System.out.println("Enter the Max height");
        int maxHeight = sc.nextInt();
        Random r = new Random();
        int[] height = new int[n];
        for(int i=0; i<n;i++){
            height[i] = r.nextInt(20);
        }
        sc.close();*/
        int [] height = {10,2,3,5,6,7};
        int maxHeight = 2;

        JumpHurdle hurdle = new JumpHurdle();
        hurdle.jump(height, maxHeight);
    }
}
