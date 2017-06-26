package com.example.graphs;

public class DijkstraAlgo {

	void dijkstra(int a[][], int src){
		int dist[] = new int [a.length];
		boolean visted[] = new boolean[a.length];
		int parent [] = new int[a.length];
		for(int v=0;v<a.length;v++){
			parent[0] = -1;
			dist[v] = Integer.MAX_VALUE;
			visted[v] = false;
		}
		
		dist[src] = 0;
		for(int count=0;count<a.length;count++){
			int u = getMinDistance(dist, visted);
			//System.out.println("Min element = " + u);
			visted[u] = true;
			for(int i=0;i<a.length;i++){
				if(!visted[i] && dist[u] != Integer.MAX_VALUE && dist[i]+a[u][i] < dist[i]){
					parent[i] = u;
					dist[i] = dist[u] + a[u][i];
				}
			}
		}
		printGraph(dist, src, parent);
	}

	private void printGraph(int[] dist, int s, int p[]) {
		// TODO Auto-generated method stub
		System.out.println("Vertex\t Distance\t Path");
		for(int i=0;i<=dist.length-1;i++){
			
			System.out.println(s+"->"+i + "\t" + dist[i] + "\t");
			
		}
	}

	private void printPath(int[] p, int i) {
		// TODO Auto-generated method stub
		if(p[i] == -1){
			return;
		}
		printPath(p, p[i]);
		System.out.println(i);
	}

	private int getMinDistance(int[] dist, boolean[] visted) {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE;
		int min_index = -1;
		for(int i=0;i<dist.length;i++){
			if(visted[i] == false && dist[i] <= min){
				min = dist[i];
				min_index = i;
			}
		}
		return min_index;
	}
	
}
