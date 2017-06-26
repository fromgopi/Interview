package com.example.tree;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagLevelOrder {
	List<List<Integer>> levelOrder(Node root){
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		Queue<Node> q = new LinkedList<Node>();
		int n=0;
		if(root == null){
			return list;
		}
		q.add(root);
		while(!q.isEmpty()){
			n = q.size();
			List<Integer> level = new LinkedList<Integer>();
			while(n>0){
				Node temp = q.remove();
				level.add(temp.data);
				if(temp.left != null){
					q.add(temp.left);
				}
				if(temp.right != null){
					q.add(temp.right);
				}
				n--;
				
			}
			Collections.reverse(level);
			list.add(level);
		}
		return list;
	}

	private void reverse(List<Integer> level) {
		// TODO Auto-generated method stub
		//List<Integer>
	}
}
