package com.example.grids;

public class IslandPerimeter {

	int perimeter(int [][] grid){
		int island=0;
		int n = 0;
		
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[i].length;j++){
				if(grid[i][j] == 1){
					island++;
					if(i<grid.length-1 && grid[i+1][j] == 1){
						n++;
					}
					if(j<grid[i].length && grid[i][j+1] == 1){
						n++;
					}
				}
			}
		}
		return ((island*4)-(n*2));
	}
}
