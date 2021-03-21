package oops.arrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionofThreeSortedArrays {

    public List<Integer> solution(int[] arr1, int[] arr2, int[] arr3) {

        List<Integer> l = new ArrayList<>();
        int[] arr = new int[2000];
        for (int i : arr1) {
            arr[i]++;
        }
        for (int i : arr2) {
            arr[i]++;
        }
        for (int i : arr3) {
            arr[i]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==3) l.add(i); 
        }
        return l;
    }

}
