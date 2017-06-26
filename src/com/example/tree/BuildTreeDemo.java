package com.example.tree;

public class BuildTreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuildTree bt = new BuildTree();
		int preOrder[] = {1,2,4,5,3,6,7};
		int inOrder[] = {4,2,5,1,6,3,7};
		int is = 0;
		int end = inOrder.length-1;
		Node out = bt.build(inOrder, preOrder, is, end);
		//bt.printInOrder(out);
	}

}
