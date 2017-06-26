package com.example.graphs;

public class TopSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Digraph g = new Digraph(3);
		g.addVertex(0);
		g.addVertex(1);
		g.addVertex(2);
		//g.addVertex(3);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.displayVertex(0);
		TopologicalSort t = new TopologicalSort();
		int [] out = t.topSort(g.adj, 2);
		for(int i=0;i<out.length;i++){
			System.out.println(out[i]);
		}
	}

}
