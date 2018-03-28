package com.example.basics;

import java.util.HashMap;

public class MaxPointsOnLine {

    public int maxPoints(Point [] points){
        if(points == null) return 0;

        int n = points.length;
        int result = 0;

        if(n <= 2){
            return n;
        }
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.clear();

        }

        return 0;
    }

}
