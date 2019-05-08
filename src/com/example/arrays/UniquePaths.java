package com.example.arrays;

import java.util.Stack;

public class UniquePaths {

    int exhaustPaths(int[][] maze, int x, int y, boolean[][] visited, int count){

        int length = maze.length;

        if(x == length-1 || y == length-1) {
            count++;
            return count;
        }
        visited[x][y] = true;

        if (validCell(x, y, length) && maze[x][y] == 1){
            // Go down from the give position (x,y) -> (x+1,y)
            if((x+1 < length) && !visited[x+1][y]){
                count = exhaustPaths(maze, x+1, y, visited, count);
            }
            // Go Up from the give position (x,y) -> (x+1,y)
            if((x-1 >= 0) && !visited[x-1][y]){
                count = exhaustPaths(maze, x-1, y, visited, count);
            }

            if((y+1 < length) && !visited[x][y+1]){
                count = exhaustPaths(maze, x, y+1, visited, count);
            }

            if((y-1 >= 0) && !visited[x][y-1]){
                count = exhaustPaths(maze, x, y-1, visited, count);
            }

        }

        visited[x][y] = false;

        return count;
    }

    private boolean validCell(int x, int y, int length) {
        if(x < 0 || y < 0 || x >= length || y >= length){
            return false;
        }

        return true;
    }


    int uniquePaths(int m, int n){

        int[][] res = new int[m][n];

        for (int i=0; i< m; i++){
            for (int j=0; j < n; ++j){
                if(i == 0 || j == 0){
                    res[i][j] = 1;
                } else {
                    res[i][j] = res[i-1][j] + res[i][j-1];
                }
            }
        }
        return res[m-1][n-1];
    }


    int uniquePaths(int[][] obstacleGrid){

        Stack<Integer> stack = new Stack<>();

        int start = 0, end=0;
        stack.push(start);
        while (stack.isEmpty()){
            int pos = stack.peek();
            if(obstacleGrid[start+1][end] == 1){
                stack.push(start+1);
            }
        }

        return 0;
    }
}
