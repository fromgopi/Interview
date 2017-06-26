package com.example.tree;

import java.util.LinkedList;
import java.util.Queue;

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

}

