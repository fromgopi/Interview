package com.example.grids;

public class IslandPerimeterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IslandPerimeter is = new IslandPerimeter();
		int [][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{0,1,0,0}};
		int out = is.perimeter(grid);
		System.out.println("Perimeter = " + out);
	}

}
