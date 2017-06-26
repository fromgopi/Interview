package com.example.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class VerticalLevelOrder {

	Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
	
	Node verticalPrint(Node root, int level){
		
		ArrayList<Integer> al = new ArrayList<>();
		if(root == null){
			return null; 
		}
		Node temp = verticalPrint(root.left, --level);
		if(temp == null){
			level++;
		}
		if(map.get(level) != null){
			ArrayList<Integer> x = map.get(level);
			x.add(root.data);
			map.put(level, x);
		}else{
			al.add(root.data);
			map.put(level, al);
		}
		
		return verticalPrint(root.right, ++level);
	}	
	
	void printResult(Map<Integer,ArrayList<Integer>> map){
		Set<Integer> i = map.keySet();
		for(int keys : i){
			System.out.println(map.get(keys));
		}
	}
}
