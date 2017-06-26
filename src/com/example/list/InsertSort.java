package com.example.list;

public class InsertSort {

	Node sort(Node head){
		Node helper = new Node(0);
		Node prev = helper;
		Node current = head;
		while(current != null){
			prev = helper;
			while(prev.next!=null && prev.next.data<current.data){
				prev = prev.next;
			} 
			Node next = current.next;
			current.next = prev.next;
			prev.next = current;
			current = next;
		}
		return helper.next;
	}
	
}
