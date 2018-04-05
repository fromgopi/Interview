package com.example.arrays;

public class DominantIndexDemo {

    public static void main(String[] args) {

        DominantIndex dominantIndex = new DominantIndex();

        int[] arr = {5,1,1,10};
        int res = dominantIndex.dominant(arr);
        System.out.println(res);
    }


}
