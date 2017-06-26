package com.example.tree;

import java.util.Stack;

public class PostOrder {

	Stack<Node> s = new Stack<>();
	void recursivePostOrder(Node root){
		if(root != null){
			recursivePostOrder(root.left);
			recursivePostOrder(root.right);
			System.out.println(root.data);
		}
	}
	
	void postOrderIt(Node root){
		if(root == null){
			return;
		}
		s.push(root);
		while(!s.isEmpty()){
			Node curr = s.peek();
			if(curr.left == null && curr.right == null){
				System.out.println(curr.data);
				s.pop();
			}
			else{
				if(curr.right != null){
					s.push(curr.right);
					curr.right = null;
				}
				if(curr.left != null){
					s.push(curr.left);
					curr.left = null;
				}
			}
		}
	}
	
	void postOrderIteS(Node k){
		Stack<Node> tempStack = new Stack<Node>();
		s.push(k);
		while(!s.isEmpty()){
			Node cur = s.pop();
			if(cur != null){
				tempStack.push(cur);
				s.push(cur.left);
				s.push(cur.right);
			}
		}
		while(!tempStack.isEmpty()){	
			System.out.println(tempStack.pop().data);
		}
	}

}
