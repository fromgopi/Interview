package com.example.arrays;

public class MakeSpiralDemo {

    public static void main(String[] args) {
        int spiralLength = 10;

        MakeSpiral make = new MakeSpiral();

        int out[][] = make.makeSpiral(spiralLength);

        for(int i=0;i<out.length;i++){
            for(int j=0;j<out.length;j++){
                System.out.print(out[i][j] + ",");
            }
            System.out.println();
        }
    }

}
