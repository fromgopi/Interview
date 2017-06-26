package com.example.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BottomUpLevelOrder {

	List<List<Integer>> levelOrderBottom(Node root){
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		if(root == null){
			return result;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(q.size()>0){
			List<Integer> level = new LinkedList<Integer>();
			int n = q.size();
			for(int i=0;i<n;i++){
				Node temp = q.remove();
				level.add(temp.data);
				if(temp.left != null){
					q.add(temp.left);
				}
				if(temp.right != null){
					q.add(temp.right);
				}
			}
			result.add(0,level);
		}
		return result;
	}
}
