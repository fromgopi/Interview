package com.example.list;

import java.util.Stack;

public class LinkedList {

	Node head;
	Node tail;
	
	void add(int data){
		Node t = new Node(data);
		
		if(head == null){
			head = t;
			tail = t;
		}
		else{
			tail.next = t;
			tail = t;
		}
		//printList();
	}
	
	Node addAtPos(int data, int pos){
		Node current = new Node(data);
		Node temp = head;
		if(head == null){
			current.next = head;
			head = current;
			return current;
		}

		if(pos == 0){
			current.next = temp;
			temp = current;
			return temp;
		}

		int i=1;
		while (i < pos && temp.next != null){
			temp = temp.next;
			i++;
		}
		if(temp.next != null){
			current.next = temp.next;
			temp.next = current;
		}else {
			temp.next = current;
		}


		return temp;


	}

		public static void printList(Node head) {
		// TODO Auto-generated method stub
		Node t = head;
		while(t != null){
			System.out.print(t.data + ",");
			t = t.next;
		}
		System.out.println();
	}
	
	void removeAtPos(int pos){
		Node runner = head;
		if(head == null){
			return;
		}
		for(int i=0;(i<pos-1)&&(runner != null);i++){
			//System.out.println(runner.data);
			runner = runner.next;
		}
		Node temp = runner.next.next;
		runner.next = temp;
		System.out.println("After deleteing the node..");
		
	}
	
	void nthNodeFromEnd(Node head, int pos){
		Node main_ref=head, ptr=head;
		int count = 0;
		while(ptr != null && count <= pos-1){
			
			count++;
		}
	}
	
	void reverseIt(){
		//In Place Reverse of Linked List
		Node current = head;
		Node next = null;
		Node prev = null;
		int count =0;
		while(current != null){
			
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		
	}
	Node reverseList(Node head){
		
		if(head == null)
			return null;
		if(head.next == null)
			return head;
		Node temp = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return temp;
	} 
	
	void deleteNode(Node head){
		if(head != null && head.next != null){
			head.data = head.next.data;
			head.next = head.next.next;
		}
		
	}
	
	Node ReverseLinkedList(Node head){
		Stack<Node> s = new Stack<Node>();
		Node ptr = head;
		while(ptr != null){
			s.push(ptr);
			ptr = ptr.next;
		}
		System.out.println(s.peek().data);
		Node temp = s.pop();
		head = temp;
		while(!s.isEmpty()){
			head =s.pop();
			head = head.next;
		}

		return head;
	}

	public static int getListLength(Node head){
		int len = 0;
		while (head.next != null){
			len++;
			head = head.next;
		}
		return len;
	}
	
}
