package com.example.list;

public class KthElementFromLastDemo {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        KthElementFromLast kth = new KthElementFromLast();

        kth.findKth(ll.head, 3);

    }
}
