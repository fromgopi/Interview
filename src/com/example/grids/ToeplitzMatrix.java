package com.example.grids;

public class ToeplitzMatrix {

    public boolean isToeplitzMatrix(int [][] matrix){
        if(matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rowSize = matrix[0].length;
        int colSize = matrix.length;

        for (int i=0; i<colSize-1; i++){
            int j=0, tempI=i;
            while( tempI < colSize - 1 && j < rowSize -1 ) {
                if(matrix[tempI][j] != matrix[++tempI][++j]) {
                    return false;
                }
            }
        }

        for(int j = 1; j < rowSize - 1; j++ ){
            int i = 0;
            int tempJ = j;
            while( i < colSize -1 && tempJ < rowSize - 1) {
                if(matrix[i][tempJ] != matrix[++i][++tempJ]) return false;
            }
        }

        return true;
    }
}
