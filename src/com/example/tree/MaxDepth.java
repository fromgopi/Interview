package com.example.tree;


public class MaxDepth {
	
	 int maxDepth(Node root) {
        if (root == null){
        	return 0;
        }
        else{
        	int lDepth=0, rDepth=0;
        	lDepth = maxDepth(root.left);
        	rDepth = maxDepth(root.right);
        	if(lDepth>rDepth){
        		return (lDepth+1);
        	}else{
        		return(rDepth+1);
        	}
        }
        
    }
}
