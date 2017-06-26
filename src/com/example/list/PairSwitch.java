package com.example.list;

public class PairSwitch {

	Node ps(Node head){
		if(head == null){
			return null;
		}
		Node temp = head;
		while(temp != null && temp.next != null){
			int t = temp.data;
			temp.data = temp.next.data;
			temp.next.data = t;
			temp = temp.next.next;
		}
		return temp;
	}
	
}
