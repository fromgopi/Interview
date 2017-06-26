package com.example.tree;

public class PostOrderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		PostOrder po = new PostOrder();
		bt.addNode(7);
		bt.addNode(3);
		bt.addNode(2);
		bt.addNode(6);
		bt.addNode(9);
		bt.addNode(10);
		bt.addNode(8);
		po.postOrderIt(bt.root);
		
		//po.postOrderIteS(bt.root);
	}

}
