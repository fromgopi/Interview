package com.example.backtracking;

public class NLightsDemo {

    public static void main(String[] args) {
        int[] lightStreak = {1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1};

        NLights lights = new NLights();
        lights.pressSwitch(lightStreak);
    }
}
