package com.example.list;

import java.util.Stack;

public class Palindrom {

	boolean checkPalindrom(Node head){
		if(head == null){
			return false;
		}
		Node sp = head;
		Node fp = head;
		while(fp != null && fp.next != null){
			fp = fp.next.next;
			sp = sp.next;
		}
		if(fp != null){
			sp = sp.next;
		}
		sp = reverse(sp);
		fp = head;
		while(fp != null){
			if(fp.data == sp.data){
				return true;
			}
			fp = fp.next;
			sp = sp.next;
		}
		return false;
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
		return null;
	}	
}
