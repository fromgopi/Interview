package com.example.arrays;

public class LeftRorateArrayDemo {

    public static void main(String[] args) {
        LeftRotateArray rotateArray = new LeftRotateArray();
        int a[] = {1,2,3,4,5,8,10,11,20};
        int num = 2;
        int pos = 4;
        int[] res = rotateArray.rotate(a, num, pos);


        for(int i=0;i<res.length;i++){
            System.out.print(res[i] + ",");
        }
        System.out.println();
    }
}
