package com.example.list;

public class ReverseKGroupDemo {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        ReverseKGroup reverseKGroup = new ReverseKGroup();

        Node res = reverseKGroup.reverseKGroup(ll.head, 3);
        System.out.println(ll.head);
        ll.printList(res);
    }
}
