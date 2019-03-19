package com.example.testpress;

public class ReverseNumber {

    int reverse(int input){
        int reverse = 0;

        if(input == 0){
            return 0;
        }
        while (input != 0){
            reverse = reverse * 10;
            reverse = reverse + input%10;
            input /= 10;
        }

        return reverse;
    }
}
