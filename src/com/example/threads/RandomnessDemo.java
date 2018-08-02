package com.example.threads;

public class RandomnessDemo {

    public static void main(String[] args) {

        Randomness rand = new Randomness();
        rand.writeRandomnessToFile(10000000);
    }

}
