package com.example.graphs;

import java.util.Stack;

public class TopologicalSort {

	
	int[] topSort(int mat[][], int src){
		int len = mat.length;
		int visArray[] = new int[len];
		Stack<Integer> s = new Stack<>();
		boolean vis[] = new boolean[len];
		int i = src;
		int pos = 0;
		vis[src] = true;
		visArray[src] = src;
		s.push(src);
		
		while(!s.isEmpty()){
			int n = s.peek();
			int child = getUnvisitedVertex(mat, n, vis);
			/*System.out.println(mat[n][child] + " dfsdfsdf ");
			break;*/
			while(true){	
				if(mat[n][child] == 1 && vis[child] == true){
					if(s.contains(child)){
						System.out.println("There is a cycle...");
						break;
					}
				}
				if(mat[n][child] == 1 && vis[child] == false){
					vis[child] = true;
					s.push(child);
					continue;
				}
			}
			int j = s.pop();
			visArray[pos++] = j;
			
		}
		return visArray;
	}

	private int getUnvisitedVertex(int[][] mat, int n, boolean[] visited) {
		// TODO Auto-generated method stub
		for(int i=0;i<mat.length;i++){
			if(mat[n][i] ==1 && !visited[i]){
				return i;
			}
		}
		return 0;
	}
}
