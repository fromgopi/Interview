package com.example.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SpiralTraversal {

	void traverse(Node root){
		if(root == null){
			System.out.println("Tree is empty..");
		}
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		s1.push(root);
		while(s1.isEmpty() || s2.isEmpty()){
			while(!s1.isEmpty()){
				Node temp = s1.pop();
				System.out.print(temp.data + " ");
				if(temp.right != null){
					s2.push(temp.right);
				}
				if(temp.left != null){
					s2.push(temp.left);
				}
			}
			while(!s2.isEmpty()){
				Node temp = s2.pop();
				System.out.print(temp.data + " ");
				if(temp.left != null){
					s1.push(temp.left);
				}
				if(temp.right != null){
					s1.push(temp.right);
				}
			}
		}
	}
	
	void traverse(Node root,int x){
		if(root == null){
			System.out.println("Tree is empty..");
		}
		int c=1,count=0;
		boolean odd = false;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()){
			
			for(int i=0;i<c;i++){
				Node temp = q.remove();
				System.out.print(temp.data + " ");
				if(odd){
					if(temp.right != null){
						q.add(temp.right);
						count++;
					}
					if(temp.left != null){
						q.add(temp.left);
						count++;
					}
				}else{
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
			count=0;
			odd = !odd;
		}
	}
	
}
