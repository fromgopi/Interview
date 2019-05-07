package com.example.arrays;

public class UniquePathsDemo {

    public static void main(String[] args) {

        int maze[][] = {
                { 1, 0, 1, 1, 0 },
                { 1, 1, 1, 0, 1 },
                { 0, 1, 0, 1, 1 }
        };

        UniquePaths up = new UniquePaths();
        int length = maze.length;
        boolean visted[][] = new boolean[length][length];
        int count = 0;

        System.out.println(up.exhaustPaths(maze, 0, 0, visted, count));

    }
}
