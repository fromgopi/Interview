package com.example.list;

public class LinkedListComponentsDemo {

    public static void main(String[] args) {

        int component[] = {1,2,3,4};

        LinkedList ll = new LinkedList();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        LinkedListComponents llc = new LinkedListComponents();

        System.out.println(llc.findComponent(ll.head, component));
    }
}
