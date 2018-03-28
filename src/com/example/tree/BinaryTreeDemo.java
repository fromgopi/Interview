package com.example.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BinaryTreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BinaryTree bt = new BinaryTree();

		bt.insert(2);
		bt.insert(4);
		bt.insert(3);
		bt.insert(5);
		bt.insert(6);
		bt.insert(12);
		bt.insert(14);
		bt.insert(1);
		bt.insert(8);
		bt.insert(9);


		/*
		LeastCommonAncestor l = new LeastCommonAncestor();
		Node out;
		bt.addNode(7);
		bt.addNode(3);
		bt.addNode(2);
		bt.addNode(6);
		bt.addNode(9);
		bt.addNode(10);
		bt.addNode(8);
		bt.addNode(1);
		LeafNodeCount lc = new LeafNodeCount();
//		System.out.println(lc.count(bt.root));
		System.out.println(lc.leafcount(bt.root));
		//bt.addNode(1);
		SpiralTraversal sp = new SpiralTraversal();
		sp.traverse(bt.root,0);
		InOrder io = new InOrder();
		io.inOrderIt(bt.root);
		bt.addNode(5);
		bt.addNode(11);
		bt.addNode(12);
		VerticalLevelOrder vl = new VerticalLevelOrder();
		out = vl.verticalPrint(bt.root, 0);
		vl.printResult(vl.map);
		MaxHeight md = new MaxHeight();
		System.out.println("The Max depth is " + md.find( bt.root));
*/	}
}
