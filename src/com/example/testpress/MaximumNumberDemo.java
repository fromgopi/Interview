package com.example.testpress;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MaximumNumberDemo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] al=new String[n];
        for(int i=0;i<n;i++)
            al[i]=sc.next();
        Arrays.sort(al,new Comparator<String>(){
            public int compare(String a,String b){
                return (b+a).compareTo(a+b);
            }
        });
        for(String s:al)
            System.out.print(s);
    }
}
