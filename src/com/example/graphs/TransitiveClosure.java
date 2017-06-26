package com.example.graphs;

public class TransitiveClosure {

	void transitiveClosure(int g[][]){
		int len = g.length;
		int reach[][] = new int[len][len];
		for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				reach[i][j] = g[i][j];
			}
		}
	}
	
}
