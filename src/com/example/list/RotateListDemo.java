package com.example.list;

public class RotateListDemo {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        RotateList rotateList = new RotateList();
        Node res = rotateList.rotateRight(ll.head, 2);
        LinkedList.printList(res);
    }
}
