package com.example.tree;



public class BTtoLinkedList {

	void flatten(Node root){
		if(root == null){
			return;
		}
		Node current = root;
		while(current != null){
			if(current.left != null){
				if(current.right != null){
					Node temp = current.left;
					while(temp.right != null){
						temp = temp.right;
					}
					temp.right = current.right;
				}
				
			}
		}
	}
	
}
