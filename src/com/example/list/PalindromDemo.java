package com.example.list;

public class PalindromDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(1);
		ll.add(2);
		ll.add(1);
		Palindrom p = new Palindrom();
		p.checkPalindrom(ll.head);
	}

}
