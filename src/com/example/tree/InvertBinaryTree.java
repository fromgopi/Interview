package com.example.tree;


public class InvertBinaryTree {

	Node invert(Node root){
		if(root == null){
			return null;
		}
		Node temp = root.left;
		root.left = invert(root.right);
		root.right = invert(temp);
		return root;
	}
}
