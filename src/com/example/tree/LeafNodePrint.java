package com.example.tree;

import java.util.Stack;

public class LeafNodePrint {

	void print(Node root){
		if(root == null){
			System.out.println("Tree is empty..");
			return;
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
				System.out.println("The leaf Node = " + temp.data);
			}
		}
	}
}
