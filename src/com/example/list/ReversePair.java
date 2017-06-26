package com.example.list;

public class ReversePair {

	Node reversePair(Node head){
		if(head == null){
			return null;
		}
		Node current = head;
		Node temp = null;
		Node newHead = null;
		while(current != null && current.next != null){
			if(temp != null){
				temp.next.next = current.next;
			}
			temp = current.next;
			current.next = temp.next;
			temp.next = current;
			
			if(newHead == null){
				newHead = temp;
			}
			current = current.next;
		}
		return newHead;
	}
}
