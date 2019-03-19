package com.example.list;

public class SplitListDemo {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.add(1);
        ll.add(2);
        ll.add(4);
        ll.add(5);
        ll.add(10);
        ll.add(111);
        ll.add(33);
        ll.add(15);
        ll.add(16);
        ll.add(17);

        SplitList sp = new SplitList();
        sp.split(ll.head, 2);
    }
}
