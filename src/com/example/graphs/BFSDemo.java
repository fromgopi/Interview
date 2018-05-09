package com.example.graphs;

public class BFSDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(8);
		g.addVertex(0);
		g.addVertex(1);
		g.addVertex(2);
		g.addVertex(3);
		g.addVertex(4);
		g.addVertex(5);
		g.addVertex(6);
		g.addVertex(7);
		g.addEdge(0, 1);
		g.addEdge(0, 3);
		g.addEdge(1, 2);
		g.addEdge(1, 5);
		g.addEdge(1, 6);
		g.addEdge(3, 5);
		g.addEdge(4, 2);
		g.addEdge(6, 2);
		g.addEdge(7, 5);
		g.addEdge(7, 6);


		
		BFS b = new BFS();
		boolean visted[] = new boolean[g.maxVertices];
		b.bfs(g.adjMatrix, 0, visted);
	}

}

