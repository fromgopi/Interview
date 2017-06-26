package com.example.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LeafNodeCount {
	
	int leafcount(Node root){
		int count =0;
		if(root == null){
			return count;
		}
		Stack<Node> s = new Stack<Node>();
		s.push(root);
		while(!s.isEmpty()){
			Node temp = s.pop();
			if(temp.right != null){
				s.push(temp.right);
			}
			if(temp.left != null){
				s.push(temp.left);
			}
			if(temp.left == null && temp.right == null){
				count++;
			}
		}
		return count;
	}
	
	int count(Node root){
		int count = 0;
		if(root == null){
			return count;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()){
			Node temp = q.remove();
			if(temp.left != null){
				q.add(temp.right);
			}
			if(temp.right != null){
				q.add(temp.left);
			}
			if(temp.left == null && temp.right == null){
				count++;
			}
		}
		return count;
	}
}
