package com.example.arrays;

public class MaxProductThreeDemo {

    public static void main(String[] args) {
        int[] A = {0, -1, 3, 100, 70, 50};

        int minVal = A[0];
        int maxVal = A[0];
        int maxProduct = A[0];

        for (int i=0; i<A.length; i++){

            if(A[i] < 0){
                int temp = maxVal;
                maxVal = minVal;
                minVal = temp;
            }

            maxVal = Math.max(A[i], (maxVal * A[i]));
            minVal = Math.min(A[i], (minVal * A[i]));

            maxProduct = Math.max(maxProduct, maxVal);
        }
        System.out.println("Max product " + maxProduct);
    }
}
