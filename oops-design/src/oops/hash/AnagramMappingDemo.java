package oops.hash;

import oops.utils.PrintArray;

public class AnagramMappingDemo {
    public static void main(String[] args) {
        
        int[] A = {12, 28, 46, 32, 50};
        int[] B = {50, 12, 32, 46, 28};

        AnagramMapping obj = new AnagramMapping();
        int[] result = obj.mapping(A, B);
        int[] res = obj.mappingWithLoops(A, B);
        
        PrintArray.printArray(res);

    }
}
