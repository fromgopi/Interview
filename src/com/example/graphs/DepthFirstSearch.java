
package com.example.graphs;

import com.example.arrays.ArrayPrint;

import java.util.Stack;

public class DepthFirstSearch {

	ArrayPrint ap = new ArrayPrint();
	
	void dfs(int mat[][], int src, boolean visted[]){
		Stack<Integer> s = new Stack<Integer>();
		s.push(src);
		visted[src] = true;
		System.out.println("Start Element " + src);
		while(!s.isEmpty()){
			int n = s.peek();
			System.out.println("Peek Element " + n);
			int child = getUnVistedVertex(mat, n, visted);
			if(child > 0){
				visted[child] = true;
				System.out.println("child is pushed into stack.  " + child);
				s.push(child);
				System.out.println("Neighbour Element for " +n+" is " + child );
			}else{
				System.out.println("Poped Element " + s.pop());
				//visted[n] = false;
			}
		}
	}

	private int getUnVistedVertex(int[][] mat, int n, boolean[] visted) {
		// TODO Auto-generated method stub
		for(int i=0;i<mat.length;i++){
			if(mat[n][i] ==1 && !visted[i]){
				return i;
			}
		}
		return 0;
	}
}
