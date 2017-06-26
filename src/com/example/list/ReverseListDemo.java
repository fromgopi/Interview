package com.example.list;

public class ReverseListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseList rl = new ReverseList();
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(33);
		ll.add(44);
		ll.add(55);
		ll.add(99);
		System.out.println(ll.head.data);
		Node out = rl.reverseList(ll.head);
		while(out != null){
			System.out.print(out.data+ ",");
			out = out.next;
		}
		System.out.println();
		
	}

}
