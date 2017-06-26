package com.example.list;

public class RemoveDuplicate {

	Node remove(Node head){
		Node list = head;
		while(list != null){
			if(list.next == null){
				break;
			}
			if(list.data == list.next.data){
				list.next = list.next.next;
			}else{
				list = list.next;
			}
		}
		return head;
	}
}
