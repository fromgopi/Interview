package com.example.threads;

public class RandomnessDemo {

    public static void main(String[] args) {

        Randomness rand = new Randomness();
//        rand.writeRandomnessToFile(1000);
        int nThreads = Runtime.getRuntime().availableProcessors();
        System.out.println(nThreads);
    }

}
