package com.example.list;

public class RemoveDuplicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		RemoveDuplicate r = new RemoveDuplicate();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(4);
		Node out = r.remove(ll.head);
		System.out.println("After Removing Duplicates ..");
		ll.printList(out);
		
	}

}
