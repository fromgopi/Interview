package com.example.list;

public class InsersectionOfListDemo {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(6);

        System.out.println("ll.head = " + ll.head);
        LinkedList LL = new LinkedList();
        LL.add(1);
        LL.add(4);
        LL.add(31);
        LL.add(3);
        LL.add(63);
        LL.add(53);
        LL.add(43);

        System.out.println("LL.head = " + LL.head);

        InsersectionOfList intersection = new InsersectionOfList();

        Node res = intersection.findIntersection(ll.head, LL.head);

        System.out.println("res = " + res);

    }
}
