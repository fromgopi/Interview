package com.example.tree;

import java.util.Stack;

public class BuildTree {
	
	static int preIndex;
	
	Node build(int io[], int[] pre, int ioStart, int ioEnd){
		
		if(ioStart > ioEnd){
			return null;
		}
		Node tNode = new Node(pre[preIndex++]);
		System.out.println(tNode.data);
		if(ioStart == ioEnd){
			return tNode;
		}
		int inIndex = search(io, ioStart, ioEnd, tNode.data);
		tNode.left = build(io, pre, ioStart, inIndex-1);
		tNode.right = build(io, pre, inIndex+1, ioEnd);
		
		return tNode;
	}

	private int search(int[] io, int ioStart, int ioEnd, int data) {
		// TODO Auto-generated method stub
		int i=0;
		for(i=ioStart;i<ioEnd;i++){
			if(io[i] == data){
				return i;
			}
		}
		return i;
	}

	public void printInOrder(Node out) {
		// TODO Auto-generated method stub
		if(out == null){
			return;
		}
		Stack<Node> s = new Stack<Node>();
		Node temp = out;
		while(!s.isEmpty() || temp != null){
			if( temp != null){
				s.push(temp);
				temp = temp.left;
			}else{
				Node t = s.pop();
				System.out.println(t.data);
				temp = t.right;
			}
		}
	}

}
