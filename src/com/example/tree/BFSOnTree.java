package com.example.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSOnTree {
	
	List<List<Integer>> bfs(Node root){
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		if(root == null){
			return result;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()){
			List<Integer> l = new LinkedList<Integer>();
			Node temp = q.peek();
			l.add(temp.data);
			while(temp.left != null){
				q.add(temp.left);
			}
			while(temp.right != null){
				q.add(temp.right);
			}
			result.add(l);
		}
		return result;
	}
}
