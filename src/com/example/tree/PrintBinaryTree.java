package com.example.tree;

public class PrintBinaryTree {

	void print(Node root, int lev){
		if(root == null){
			return;
		}
		print(root.right, lev+1);
		if(lev != 0){
			for(int i=0;i<lev-1;i++){
				System.out.print("|\t");
	            System.out.println("|-------"+root.data);
			}
		}
		else{
			System.out.println(root.data);
		}
		print(root.left, lev+1);
	}
	
}
