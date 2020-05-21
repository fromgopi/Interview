package com.example.sorting;
public class InsertionSortPartOne {

    /**
     * <h2>Insertion Sort function.</h2>
     * @param a Array to be Sorted
     */
    void sortOne(int[] a){
        int len = a.length;
        int var = a[len-1];
        System.out.println(var);

        for (int i = len-2; i >= -1; i--) {

            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

}
