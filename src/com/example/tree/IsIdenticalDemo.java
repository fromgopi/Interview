package com.example.tree;

public class IsIdenticalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		BinaryTree b = bt;
		bt.addNode(7);
		bt.addNode(3);
		bt.addNode(2);
		bt.addNode(6);
		bt.addNode(9);
		bt.addNode(10);
		bt.addNode(8);
		bt.addNode(1);
		
		b.addNode(7);
		b.addNode(3);
		b.addNode(2);
		b.addNode(6);
		b.addNode(9);
		b.addNode(10);
		b.addNode(8);
		b.addNode(1);
		System.out.println(b + " , " + bt);
		
		IsIdentical is = new IsIdentical();
	}

}
