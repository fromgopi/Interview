package com.example.dynamicprogramming;

public class MaxPathSumInTri {

    public void findMaxPathSum(int [][] triangle){
        for(int r=triangle.length-2; r>=0;r--){
            for (int c=0;c<=r;c++){
                int bellow = triangle[r+1][c];
                int bellowAndRight = triangle[r+1][c+1];
                int max = Math.max(bellow, bellowAndRight);
                triangle[r][c] += max;
            }
        }

        System.out.println(triangle[0][0]);
    }

}
