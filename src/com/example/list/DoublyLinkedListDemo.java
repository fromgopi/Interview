package com.example.list;

public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.addHead(5);
		dll.addHead(55);
		dll.addHead(99);
		dll.addAtEnd(dll.head,dll.tail, 87);
		dll.addHead(3);
		dll.addAtPos(dll.head, 2, 77);
		dll.addAtPos(dll.head, 1, 100);
		dll.addAtPos(dll.head, 3, 85);
		dll.print(dll.head);
		
		//dll.print(dll.head);
	}

}
