package com.example.arrays;

public class SearchRangeDemo {

    public static void main(String[] args) {

        int[] array = {1,2,5,6,6,8,8,8,8,8,8,10,11};

        int target = 2;

        SearchRangeInArray s = new SearchRangeInArray();

        int[] res = s.search(array, target);

        ArrayPrint ap = new ArrayPrint();
        ap.print(res);

    }

}
