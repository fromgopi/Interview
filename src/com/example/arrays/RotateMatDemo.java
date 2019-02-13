package com.example.arrays;

public class RotateMatDemo {

    public static void main(String[] args) {
        int mat[][] = {
                {1,2},
                {3,4}
        };

        System.out.println(mat.length);

        RotateMat rotateMat = new RotateMat();
        rotateMat.rotate(mat, mat.length);
    }
}
