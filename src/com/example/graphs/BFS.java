package com.example.graphs;


import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	void bfs(int [][] a, int start, boolean visted[]){
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		visted[start] = true;
		System.out.println("Start = " +start);
		while(!q.isEmpty()){
			int n = q.peek();
			System.out.println("peek = " + n);
			int neighbour = getUnvistiedVertex(a, n, visted);
			System.out.println("neighbours for peek = " + neighbour);
			if(neighbour > 0){
				q.add(neighbour);
				visted[neighbour] = true;
				System.out.println("Added to Queue = " + neighbour);
			}
			else{
				q.remove();
			}
		}
	}

	private int getUnvistiedVertex(int[][] a, int n, boolean[] visted) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++){
			if(a[n][i] == 1 && !visted[i]){
				return i;
			}
		}
		return 0;
	}
}
