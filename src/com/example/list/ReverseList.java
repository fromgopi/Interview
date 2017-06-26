package com.example.list;

import java.util.Stack;

public class ReverseList {

	 public Node reverseList(Node head) {
	       Stack<Node> s = new Stack<Node>();
			if(head == null){
				System.out.println("List is empty");
			}
			Node temp = head;
			while(temp != null){
				s.push(temp);
				temp = temp.next;
			}
			head = s.pop();
			head.next = s.peek();
			temp = head.next;
			while(!s.isEmpty()){
			    temp = s.pop();
			    if (!s.isEmpty())
			    	temp.next = s.peek();
			    else
			    	temp.next = null;
			    System.out.println("------"+temp.next);
			    temp = temp.next;
			}
	        return head;
	    }
	
}
