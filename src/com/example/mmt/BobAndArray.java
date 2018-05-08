package com.example.mmt;

import java.util.Scanner;

public class BobAndArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        int[] A;
        String NnQ = sc.nextLine();
        String[] nAq = NnQ.split(" ");
        A =  new int[Integer.parseInt(nAq[0])];
        for(int i=0;i<Integer.parseInt(nAq[0]);i++){
            A[i] = 0;
        }
       /* while (sc.hasNextLine()){
            int op = Integer.parseInt(sc.nextLine().split(" ")[0]);
            System.out.println("op = " + op);
            int pos = Integer.parseInt(sc.nextLine().split(" ")[1]);
            if(sc.hasNext()){
                int pos2 = Integer.parseInt(sc.nextLine().split(" ")[2]);
                System.out.println("pos2 = " + pos2);
            }
            //operations(A, op, pos,0);
        }*/
    }

    static void operations(int[] A, int op, int pos, int pos1){
        System.out.println("op = " + op);
        /*if (op == 1){
            A[pos] = (A[pos] * 2) + 1;
        }
        if(op == 3){
            int a = Integer.parseInt(Integer.toBinaryString(A[pos]));
            System.out.println(a);
        }*/
    }
}
