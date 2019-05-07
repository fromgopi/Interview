package com.example.grids;

public class ToeplitzMatrixDemo {

    public static void main(String[] args) {
        int [][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        ToeplitzMatrix tm = new ToeplitzMatrix();
        System.out.println(tm.isToeplitzMatrix(mat));
    }
}
