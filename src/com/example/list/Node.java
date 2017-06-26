package com.example.list;

public class Node {

	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
	
	Node(Node n, int d){
		this.data = d;
		this.next = n;
	}
}
