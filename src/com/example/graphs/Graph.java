/*
	G(V,E) Denotes a Undirected Graph without Weights.
*/
package com.example.graphs;


public class Graph {
	int maxVertices;
	Vertex vertexList[];
	int adjMatrix[][];
	int vertexCount;
	
	public Graph(int V) {
		// TODO Auto-generated constructor stub
		this.maxVertices = V; 
		vertexList = new Vertex[maxVertices];
		adjMatrix = new int[maxVertices][maxVertices];
		vertexCount=0;
		for(int y=0;y<maxVertices;y++){
			for(int x=0;x<maxVertices;x++){
				adjMatrix[x][y] = 0;
			}
		}
	}
	
	void addVertex(int n){
		vertexList[vertexCount++] = new Vertex(n);
	}
	
	void addEdge(int start, int end){
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}
	
	void displayVertex(int v){
		System.out.println(vertexList[v].num);
		for(int i=0;i<adjMatrix.length;i++){
			for(int j=0;j<adjMatrix.length;j++){
				System.out.print(adjMatrix[i][j] + ",");
			}
			System.out.println();
		}
		
	}
	
	
}
