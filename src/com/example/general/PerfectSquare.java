package com.example.general;

public class PerfectSquare {


    public boolean findSquare(int number){

        int low = 1, high = number;

        while (low <= high){
            long mid = (low + high) >>> 1;

            if (mid * mid == number){
                return true;
            }

            if(mid * mid < number){
                low = (int) (mid + 1);
            }else {
                high = (int) (mid - 1);
            }
        }


        return false;
    }
}
