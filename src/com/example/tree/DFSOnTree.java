package com.example.tree;

import java.util.LinkedList;
import java.util.List;
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

	List<List<Integer>>dFs(Node root){
		List<List<Integer>> result = new LinkedList<List<Integer>>();

		if(root == null){
			return result;
		}
		Stack<Node> stack = new Stack<>();

		stack.push(root);
		while(!stack.isEmpty()){
			List<Integer> temp = new LinkedList<>();
			Node current = stack.pop();
			temp.add(current.data);
			if(current.right != null){
				stack.push(current.right);
			}
			if(current.left != null){
				stack.push(current.left);
			}
			result.add(temp);
		}
		return result;
	}
}
