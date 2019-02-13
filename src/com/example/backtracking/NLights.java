package com.example.backtracking;

public class NLights {

    void pressSwitch(int[] A){
        /*
        * int num = 0;
        boolean isSwitched = false;
        for(int x = 0; x < A.length; x++){
            if(isSwitched){
               if(A[x] == 1){
                    num++;
                    isSwitched = false;
                }
            } else{
                if(A[x] == 0){
                    num++;
                    isSwitched = true;
                }
            }
        }*/

        int num = 0;
        boolean isSwitched = false;
        for (int i=0;i<A.length;i++){
            if(isSwitched) {
                if(A[i] == 1){
                    num += 1;
                    isSwitched = false;
                } else {
                    if (A[i] == 0) {
                        num += 1;
                        isSwitched = true;
                    }
                }
            }
        }
        System.out.println(num);
    }
}
