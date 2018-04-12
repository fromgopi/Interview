package com.example.list;

import java.util.Stack;

public class Palindrom {

	boolean checkPalindrom(Node head){
		Node fast = head, slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		if (fast != null) { // odd nodes: let right half smaller
			slow = slow.next;
		}
		slow = reverse(slow);
		fast = head;

		while (slow != null) {
			if (fast.data != slow.data) {
				return false;
			}
			fast = fast.next;
			slow = slow.next;
		}
		return true;
	}

	private Node reverse(Node sp) {
		// TODO Auto-generated method stub
		Node temp = sp;
		Node next = null, prev = null;
		while(temp != null){
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
		}
		return temp;
	}	
}
