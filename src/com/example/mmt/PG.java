package com.example.mmt;

import java.util.Scanner;

public class PG {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String T = sc.nextLine();
        int t = Integer.parseInt(T);
        System.out.println(t);
        while (sc.hasNextLine()){
            String sol = sc.nextLine();
            if(sol.isEmpty()){
                sol = sc.nextLine();
            }
            String S = sc.nextLine();
            if(S.isEmpty()){
                S = sc.nextLine();
            }
            System.out.println("S = " + S);
            String[] strength = S.split(" ");

            if(!poisonousGas(strength)){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }

            t--;
        }
    }

    private static boolean poisonousGas(String[] strength) {
        int total = 0;
        for (String n : strength){
            int check=0;

            int N = Integer.parseInt(n);
            if(N > check){
                total = total+N;
            }
            else {
                continue;
            }
        }
        System.out.println("total = " + total);
        while (total > 1){
            if(total%2 != 0){
                return false;
            }
            if(total%2 == 0){
                if(total/2 == 1){
                    return true;
                }
            }
            total /= 2;
        }
        return true;
    }
}
