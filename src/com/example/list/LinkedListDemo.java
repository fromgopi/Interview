package com.example.list;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add(22);
		ll.add(1);
		ll.add(4);
		ll.add(100);
		ll.add(32);
		ll.add(343);

		Node test = ll.reverseList(ll.head);

		ll.printList(test);
	}

}
