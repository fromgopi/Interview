package com.example.testpress;

import java.util.Scanner;

public class ClosestGiftDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for (i = n ; ; i++) {
            if(prime(i)){
                break;
            }
        }
        System.out.println(i-n);
    }

    private static boolean prime(int i) {
        if(i == 0 || i == 1){
            return false;
        }
        for (int j=2; j<=Math.sqrt(i); j++){
            if(i%j == 0){
                return false;
            }
        }
        return true;
    }
}
