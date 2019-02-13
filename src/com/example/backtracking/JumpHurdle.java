package com.example.backtracking;

import java.util.Arrays;

public class JumpHurdle {
    void jump(int[] height, int maxHeight) {
        Arrays.sort(height);
        int diff = height[height.length - 1] - maxHeight;

        System.out.println((diff > 0 ? diff : 0));

    }
}
