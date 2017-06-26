package com.example.list;

public class DoublyLinkedList {

	DNode head;
	DNode tail;
	
	void addHead(int val){
		DNode newNode = new DNode(val);
		newNode.next = head;
		head = newNode;
		tail = head;
	}
	
	void print(DNode head){
		DNode run = tail;
		while(run != null){
			System.out.print(run.val+",");
			run = run.next;
		}
		System.out.println();
	}
	
	void addAtPos(DNode head, int pos,int val){
		DNode newNode = new DNode(val);
		if(head == null || pos == 0){
			addHead(val);
		}
		DNode temp = head;
		for(int i=0;i<pos-1;i++){
			//System.out.println(temp.val);
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next.prev = newNode;
		temp.next = newNode;
		newNode.prev = temp;
	}
	
	void addAtEnd(DNode head, DNode tail,int val){
		DNode data = new DNode(val);
		if(head == null){
			data.next = head;
			head = data;
			tail = head;
		}
		else{
			data.prev = tail;
			tail.next = data;
			data.next = null;
			tail = data;
		}
	}
	
	void removeHead(DNode head){
		
	}
}
