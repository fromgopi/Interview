package com.example.graphs;

import java.util.Stack;

public class CycleDetection {

	void detect(int mat[][], int start){
		Stack<Integer> s = new Stack<Integer>();
		int total = mat.length;
		boolean vis[] = new boolean[total];
		s.push(start);
		vis[start] = true;
		while(!s.isEmpty()){
			int n = s.peek();
			int child = getUnvistedVerex(mat, n, vis);
			//System.out.println("About enter into while loop....");
			
			while(mat[n][child] == 1 && vis[child] == true ){
				if(s.contains(child)){
					System.out.println("There is a loop from "+n+" to "+child);
					return;
				}
			}
				
			if(mat[n][child] == 1 && !vis[child]){
				s.push(child);
				vis[child] = true;
				System.out.println(child);
				continue;
			}else{
				s.pop();
				
			}
			
		}
	}

	private int getUnvistedVerex(int[][] mat, int n, boolean[] vis) {
		// TODO Auto-generated method stub
		for(int i=0;i<mat.length;i++){
			if(mat[n][i] == 1 && !vis[i]){
				return i;
			}
		}
		return 0;
	}
}
