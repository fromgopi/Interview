package com.example.list;

public class ReverseKGroup {

    public Node reverseKGroup(Node head, int k){

        Node current = head;
        int count =0;
        while(count < k){
            if(current == null)
                return head;
            current = current.next;
            count += 1;
        }

        Node pre = reverseKGroup(current, k);
        while( count > 0){
            Node next = head.next;
            head.next = pre;
            pre = head;
            head = next;
            count = count - 1;
        }
        return pre;
    }

}
