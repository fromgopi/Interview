package com.example.graphs;

public class Digraph {

	int maxVertices;
	
	Vertex vertexList[];
	int adj[][] ;
	int count;
	
	public Digraph(int mV) {
		// TODO Auto-generated constructor stub
		this.maxVertices = mV;
		
		vertexList = new Vertex[mV];
		adj = new int[mV][mV];
		count = 0;
		for(int i=0;i<mV;i++){
			for(int j=0;j<mV;j++){
				adj[i][j] = 0;
			}
		}
	}
	
	void addVertex(int v){
		vertexList[count++] = new Vertex(v);
	}
	
	void addEdge(int start, int end){
		adj[start][end] = 1;
	}

	void printVertex(){

	}
	
	void displayVertex(int v){
		System.out.println(vertexList[v].num);
		for(int i=0;i<adj.length;i++){
			for(int j=0;j<adj.length;j++){
				System.out.print(adj[i][j] + ",");
			}
			System.out.println();
		}
	}
}
