package com.example.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MaxHeight {

	int find(Node root){
		if(root ==  null){
			return 0;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int level = 0;
		while(true){
			int nodeCount = q.size();
			if(nodeCount == 0){
				return level;
			}
			level++;
			while(nodeCount > 0){
				Node temp = q.remove();
				System.out.println("temp.data = " + temp.data);
				if(temp.left != null){
					q.add(temp.left);
				}
				if(temp.right != null){
					q.add(temp.right);
				}
				nodeCount--;
			}
		}
		
	}



	int findHeight(Node root){
		int nodecount=0;
		if(root.left == null || root.right ==  null){
			return 0;
		}

		Queue<Node> q = new LinkedList<>();

		q.add(root);
		while(!q.isEmpty()){

			nodecount = q.size();
			Node temp = q.remove();
			if(temp.left != null){

			}
		}

		return 0;
	}

}

