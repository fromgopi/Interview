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
		InsertSort is = new InsertSort();
		Node out = is.sort(ll.head);
		ll.printList(out);
	}

}
