package com.example.list;

public class KthElementFromLast {

    void findKth(Node head, int k){

        Node fast = head;
        Node slow = head;
        int start = 1;

        while (fast.next != null){
            fast = fast.next;
            start++;

            if(start > k){
                slow = slow.next;
            }
        }

        System.out.println(slow.data);

    }

}
