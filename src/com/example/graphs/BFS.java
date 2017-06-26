package com.example.graphs;


import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	void bfs(int [][] a, int start, boolean visted[]){
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		visted[start] = true;
		System.out.println(start);
		while(!q.isEmpty()){
			int n = q.peek();
			int neighbour = getUnvistiedVertex(a, n, visted);
			if(neighbour > 0){
				q.add(neighbour);
				visted[neighbour] = true;
				System.out.println(neighbour);
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
