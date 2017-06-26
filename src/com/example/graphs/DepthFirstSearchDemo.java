package com.example.graphs;

public class DepthFirstSearchDemo {

	public static void main(String args[]){
		Digraph g = new Digraph(5);
		g.addVertex(0);
		g.addVertex(1);
		g.addVertex(2);
		g.addVertex(3);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		boolean vis[] = new boolean[g.maxVertices];
		CycleDetection c = new CycleDetection();
		c.detect(g.adj, 0);
		//g.displayVertex(2);
		/*g.addVertex(0);
		g.addVertex(1);
		g.addVertex(2);
		g.addVertex(3);
		g.addVertex(4);
		g.addVertex(5);
		g.addVertex(6);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 4);
		g.addEdge(1, 5);
		g.addEdge(2, 6);
		g.addEdge(3, 5);*/
		/*g.addVertex(0);
		g.addVertex(1);
		g.addVertex(2);
		g.addVertex(3);
		g.addVertex(4);
		g.addVertex(5);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(3, 5);
		g.addEdge(4, 5);
		//
		DepthFirstSearch dfs = new DepthFirstSearch();
		boolean vis[] = new boolean[g.maxVertices];
		long st = System.currentTimeMillis();
		dfs.dfs(g.adj, 2, vis);
		long et = System.currentTimeMillis();
		System.out.println(et-st+"ms");*/
	}
}
