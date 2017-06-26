package com.example.list;

public class CycleDetectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		
		ll.add(7);
		ll.add(8);
		CycleDetection cd = new CycleDetection();
		ll.head.next.next.next.next.next.next.next = ll.head.next.next;
		//ll.head.next.next = ll.head.next.next.next.next.next.next.next;
		cd.loopDetectAndRemove(ll.head);
	}

}
