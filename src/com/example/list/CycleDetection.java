package com.example.list;

public class CycleDetection {

	void createLoop(Node node){
		node.next.next = node.next.next.next.next.next.next.next;
		System.out.println(node.next.next.next.next.next.data);
	}
	
	void loopDetectAndRemove(Node node){
		Node slow = node, fast=node;
		 slow = slow.next;
		 fast = fast.next.next;
	     while(fast != null && fast.next != null){
	    	 if(slow == fast){
	    		 //System.out.println("slow and fast meet at -> " + fast.data);
	    	 	 break;
	    	 }
	    	 slow = slow.next;
	    	 fast = fast.next.next;
	     }
	     slow = node;
	     while(true){
	    	 if(slow == fast){
	    		 //System.out.println("Loop starting point is " + fast.data );
	    		 break;
	    	 }
	    	 slow = slow.next;
	    	 fast = fast.next;
	     }
	}
}
