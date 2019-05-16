package com.example.leetcode.medium.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequentElements {

    void findFrequentElement(int[] a){

        Arrays.sort(a);
        int previous = a[0];
        int frequent = a[0];
        int count = 1;
        int maxCount = 0;

        for (int i = 0; i < a.length; i++) {
//            System.out.println("ith Pos = " + i + ", Element = " + a[i] + ", previous = " + previous + ", frequent = " + frequent + ", Count = " + count + ", Max = " + maxCount);
            if(a[i] == previous){
                count++;
            } else {
                if(count > maxCount) {
                    frequent = a[i-1];
                    maxCount = count;
                }
                previous = a[i];
                count = 1;
            }
        }
        System.out.println(count > maxCount ? a[a.length-1] : frequent);
    }

    void findFrequntElements(int[] a){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            int key = a[i];
            if(map.containsKey(key)) {
                int freq = map.get(key);
                freq ++;
                map.put(key, freq);
            }else {
                map.put(key, 1);
            }
        }

        int count = 0, maxFreq = -1;
        for(Map.Entry<Integer, Integer> val: map.entrySet()){
            if(count < val.getValue()){
                maxFreq = val.getKey();
                count = val.getValue();
            }
        }

//        System.out.println(map);
        System.out.println( maxFreq);
    }


    void findNextFrequentElement(int[] a) {
        int secondMostRepeating = 0;
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int count = 1;

        for (int num : a){
            if(mp.containsKey(num)){
                count = mp.get(num);
                mp.put(num, ++count);
            } else {
                mp.put(num, count);
            }
        }

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> val: mp.entrySet()){
            if(val.getValue() >= max){
                max = val.getValue();
            }else if (val.getValue() >= secMax){
                secMax = val.getValue();
                secondMostRepeating = val.getKey();
            }
        }
        System.out.println(mp);
        System.out.println(secondMostRepeating + " occurred " + secMax + " times");
    }
}
