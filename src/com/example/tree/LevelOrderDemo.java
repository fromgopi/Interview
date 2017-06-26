package com.example.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelOrderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree bt = new BinaryTree();
		LevelOrder lo = new LevelOrder();
		bt.addNode(7);
		bt.addNode(3);
		bt.addNode(2);
		bt.addNode(6);
		bt.addNode(9);
		bt.addNode(10);
		bt.addNode(8);

		List<List<Integer>> out = new LinkedList<List<Integer>>();
		out = lo.levelOrder(bt.root);
		
	}

}
