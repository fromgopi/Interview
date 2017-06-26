package com.example.tree;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

	Node root;
	Stack<Node> s = new Stack<Node>();
	
	void addNode(int data){
		Node newNode = new Node(data);
		if(root == null){
			root = newNode;
		}else{
			Node temp = root;
			Node parent;
			while(true){
				parent = temp;
				if(data < temp.data){
					temp = temp.left;
					if(temp == null){
						parent.left = newNode;
						break;
					}
				}
				else{
					temp = temp.right;
					if(temp == null){
						parent.right = newNode;
						break;
					}
				}
			}
		}
	}
	
	void preOrder(Node tempNode){
		if(tempNode != null){
			System.out.println(tempNode.data);
			preOrder(tempNode.left);
			preOrder(tempNode.right);
		}
	}
	
	void postOrder(Node currentNode){
		if(currentNode != null){
			postOrder(currentNode.left);
			postOrder(currentNode.right);
			System.out.println(currentNode.data);
		}
	}
	
	void zigzagLevelOrder(Node root){
		boolean rTl=false;
		int count=0, c=1;
		Queue<Node> q = new LinkedList<Node>();
		while(!q.isEmpty()){
			if(root == null){
				break;
			}
			q.add(root);
			count = q.size();
			for(int i=0;i<count;i++){
				Node temp = q.remove();
				System.out.print(temp.data + "\n");
				if(rTl){
					if(temp.right != null){
						q.add(temp.right);
						count++;
					}
					if(temp.left != null){
						q.add(temp.left);
						count++;
					}
				}
				else{
					if(temp.left != null){
						q.add(temp.left);
						count++;
					}
					if(temp.right != null){
						q.add(temp.right);
						count++;
					}
				}
			}
			c = count;
			rTl = !rTl;
			count = 0;
		}
		
	}
	
	void levelOrder(Node root){
		Queue<Node> q = new LinkedList<Node>();
		if(root == null){
			return;
		}
		else{
			q.add(root);
			while(!q.isEmpty()){
				Node temp = q.remove();
				//System.out.println(temp.data);
				if(temp.left != null){
					q.add(temp.left);
				}
				if(temp.right != null){
					q.add(temp.right);
				}
			}
		}
	}
}
