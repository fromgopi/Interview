package com.example.list;

public class PartitionList {


    public Node doPartition(Node head, int target ) {
        if(head == null && head.next == null) {
            return head;
        }
        Node prevPart = new Node(-1);
        Node restPart = new Node(-1);
        Node prev = prevPart;
        Node rest = restPart;

        while (head != null) {
            if(head.data < target){
                prev.next = new Node(head.data);
                prev = prev.next;
            } else {
                rest.next = new Node(head.data);
                rest = rest.next;
            }
            head = head.next;
        }

        Node tail = getTail(prevPart);
        tail.next = restPart.next;
        return prevPart;

    }

    private Node getTail(Node prevPart) {
        if(prevPart.next != null){
            prevPart.next = prevPart;
        }
        return prevPart;
    }
}
