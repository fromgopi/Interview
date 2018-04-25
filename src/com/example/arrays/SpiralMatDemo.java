package com.example.arrays;

public class SpiralMatDemo {

    public static void main(String[] args) {

        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };


        SpiralMat mat = new SpiralMat();

        System.out.println(mat.spiralOrder(array));

    }
}
