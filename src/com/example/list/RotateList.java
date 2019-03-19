package com.example.list;


public class RotateList {

    Node rotateRight(Node head, int place){
        // TODO: Rotate list to the right by k places.

        if (head==null||head.next==null) return head;
        Node dummy=new Node(0);
        dummy.next=head;
        Node fast=dummy,slow=dummy;

        int i;
        for (i=0;fast.next!=null;i++)//Get the total length 
            fast=fast.next;

        for (int j=i-place%i;j>0;j--) //Get the i-n%i th node
            slow=slow.next;

        fast.next=dummy.next; //Do the rotation
        dummy.next=slow.next;
        slow.next=null;

        return dummy.next;
    }
}
