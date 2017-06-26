package com.example.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

	static int level = 0;
	
	List<List<Integer>> levelOrder(Node root){
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		if(root == null){
			return result;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		/*System.out.println("At level "+level +"The elements are " + root.data);*/
		while(!q.isEmpty()){
			List<Integer> level = new LinkedList<Integer>();
			Node temp = q.remove();
			level.add(temp.data);
			if(temp != null){
				q.add(temp.left);
			}
			if(temp.right != null){
				q.add(temp.right);
			}
			result.add(level);
		}
		return result;
	}
	
}
