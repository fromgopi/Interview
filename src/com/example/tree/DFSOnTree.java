package com.example.tree;

import java.util.Stack;

public class DFSOnTree {

	void dfs(Node root){
		if(root == null){
			return;
		}
		Stack<Node> s = new Stack<Node>();
		s.push(root);
		while(!s.isEmpty()){
			Node x = s.pop();
			if(x.right != null){
				s.push(x.right);
			}
			if(x.left != null){
				s.push(x.left);
			}
			System.out.print(x.data + ",");
		}
		System.out.println();
	}
	
	void dfsOnTree(Node root){
		if(root == null){
			return;
		}
		System.out.println("Root Val = " + root.data);
		dfsOnTree(root.left);
		dfsOnTree(root.right);
		
	}
}
