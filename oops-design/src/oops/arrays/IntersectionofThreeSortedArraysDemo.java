package oops.arrays;

import java.util.List;

public class IntersectionofThreeSortedArraysDemo {
    public static void main(String[] args) {
        
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,5,7,9};
        int[] arr3 = {1,3,4,5,8};

        IntersectionofThreeSortedArrays obj = new IntersectionofThreeSortedArrays();
        List<Integer> res = obj.solution(arr1, arr2, arr3);
        System.out.println(res);
    }
}
