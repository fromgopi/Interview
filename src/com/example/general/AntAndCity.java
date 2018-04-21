package com.example.general;

import java.util.Scanner;

public class AntAndCity {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Test cases....");
        int T = Integer.parseInt(sc.nextLine());

        for(int i=0;i<T;i++){

            int n = sc.nextInt();

            if(n == 0){
                System.out.println(0);
            }

            if(n == 1 || n == 3){
                System.out.println(0);
            }


        }

    }

}
