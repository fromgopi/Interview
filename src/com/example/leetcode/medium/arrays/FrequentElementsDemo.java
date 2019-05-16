package com.example.leetcode.medium.arrays;

public class FrequentElementsDemo {

    public static void main(String[] args) {

        // Medium LC-540

        int a[] = {1,3,2,1,4,5,9,10,9,1,22,1};

       /* Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of array\n");
        int p = sc.nextInt();
        int a[] = new int [p];
        for(int i=0;i<a.length;i++){
            a[i] = r.nextInt(p);
        }*/

        FrequentElements fe = new FrequentElements();
        /*long startTime = System.currentTimeMillis();
        fe.findFrequentElement(a);
        System.out.println("without hash map " + (System.currentTimeMillis() - startTime));
        fe.findFrequntElements(a);
        System.out.println("with hash map " + (System.currentTimeMillis() - startTime));*/
        fe.findNextFrequentElement(a);
    }
}
