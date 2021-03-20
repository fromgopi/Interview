package oops.hash;

import oops.utils.PrintArray;

public class SortFeaturesByPopularityDemo {

    public static void main(String[] args) {
        
        // String[] features = {"cooler","lock","touch"};
        String[] features = {"a","aa","b","c"};
        // String[] response = {"i like cooler cooler","lock touch cool","locker like touch"};
        String[] response = {"a","a aa","a a a a a","b a"};

        SortFeaturesByPopularity obj = new SortFeaturesByPopularity();
        String[] res = obj.solution(features, response);
        PrintArray.printArray(res);
    }
    
}
