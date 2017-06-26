package com.example.tree;

import java.util.Stack;

public class InOrder {

	
	void inOrderIt(Node root){
		if(root == null){
			return;
		}
		Stack<Node> s = new Stack<Node>();
		Node temp = root;
		while(!s.isEmpty() || temp != null){
			if( temp != null){
				s.push(temp);
				temp = temp.left;
			}else{
				Node out = s.pop();
				System.out.println(out.data);
				temp = out.right;
			}
		}
	}
}
