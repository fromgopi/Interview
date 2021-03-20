package oops.utils;

public class PrintArray {

    public static void printArray (int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
    }

    public static void printArray(String[] array){
        for (String string : array) {
            System.out.print(string + " ");
        }   
        System.out.println();
    }
    
}
