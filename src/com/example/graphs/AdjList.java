package com.example.graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;



public class AdjList {

	Map<Integer, List<Integer>> map;
	public AdjList(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<Integer, List<Integer>>();
		for(int i=0;i<v;i++){
			map.put(i, new LinkedList<Integer>());
		}
	}
}
