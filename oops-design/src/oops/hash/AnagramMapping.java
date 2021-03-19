package oops.hash;

import java.util.HashMap;
import java.util.Map;

public class AnagramMapping {

    public int[] mapping(int[] A, int[] B){
        /**
         * Using Hashmap we can ge the index
         */

        int[] result = new int[A.length];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < B.length; i++) {
            map.put(B[i], i);
        }

        for (int i = 0; i < A.length; i++) {
            result[i] = map.get(A[i]);
        }
        return result;
    }

    public int[] mappingWithLoops(int[] A, int[] B){

        int[] result = new int[A.length];
        int index = 0;
        for(int i : A){
            for (int j = 0; j < B.length; j++) {
                if (i == B[j]) {
                    // System.out.println("Position of the element " + i + " in B is " + j);                    
                    result[index] = j;
                    index++;
                    break;
                }
            }
        }
        return result;
    }

}
