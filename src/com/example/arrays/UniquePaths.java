package com.example.arrays;

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
            // Go down from the give position (x,y) -> (x+1,y)
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
}
