package com.example.arrays;

public class StudentAttendanceRecord {


    public boolean find(String s){
        int a = 0;
        int l = 0;

        for(char ch : s.toCharArray()){

            if(ch == 'A'){
                a++;
                if(a > 1){
                    return false;
                }
                l = 0;
            }else if (ch == 'L'){
                l++;
                if(l > 2){
                    return false;
                }
            }else{
                l = 0;
            }
        }
        return true;
    }

}
