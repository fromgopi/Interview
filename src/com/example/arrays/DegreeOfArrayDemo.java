package com.example.arrays;

public class DegreeOfArrayDemo {

    public static void main(String[] args) {
        int a[] = {1,2,2,3,1,4,2};

        DegreeOfArray degree = new DegreeOfArray();

        int res = degree.findShortestSubArray(a);

        System.out.println(res);
    }
}
