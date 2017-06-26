package com.example.tree;

import java.util.List;

public class BFSDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		bt.addNode(5);
		bt.addNode(9);
		bt.addNode(12);
		BFSOnTree b = new BFSOnTree();
		List<List<Integer>> out = b.bfs(bt.root);
		System.out.println(out);
	}

}
