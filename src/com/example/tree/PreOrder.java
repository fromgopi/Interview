package com.example.tree;

import java.util.Stack;

public class PreOrder {

	Stack<Node> s = new Stack<Node>();
	void preOrderRec(Node root){
		if(root != null){
			System.out.println(root.data);
			preOrderRec(root.left);
			preOrderRec(root.right);
		}
	}
	
	void iterativePreorder(Node root){
		Node currentNode = root;
		while(true){
			while(currentNode != null){
				System.out.println(currentNode.data);
				s.push(currentNode);
				currentNode = currentNode.left;
			}
			if(s.isEmpty()){
				break;
			}else{
				currentNode = s.pop();
				currentNode = currentNode.right;
			}
		}
	}
}
