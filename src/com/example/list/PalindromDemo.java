package com.example.list;

public class PalindromDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(0);
		ll.add(0);
		ll.add(1);
		ll.add(0);
		ll.add(0);
		ll.add(0);
		Palindrom p = new Palindrom();
		System.out.println(p.checkPalindrom(ll.head));
	}

}
