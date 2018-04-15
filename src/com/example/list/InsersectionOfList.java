package com.example.list;

public class InsersectionOfList {
    
    
    public Node findIntersection(Node headA, Node headB){

        Node p1 = headA;
        Node p2 = headB;

        while(p1 != p2){
            p1 = p1 == null? headB : p1.next;
            p2 = p2 == null? headA : p2.next;
        }
        return p1;
        
    }
}
