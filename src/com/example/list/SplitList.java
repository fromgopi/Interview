package com.example.list;

public class SplitList {

    void split(Node head, int k){
        int counter = LinkedList.getListLength(head);
        Node root = head;

        int mod = counter > k ? counter%k : 0;
        Node[] nodeList = new Node[k];
        int groupList = counter/k;
        for (int i=0; i<k; i++){
            nodeList[i] = head;
            for (int j=0; j<groupList; j++, head=head.next){
                if(mod-- > 0){
                    head = head.next;
                }
            }
            if (head != null){
                Node temp = head;
                head = head.next;
                temp.next = null;
            }
        }

    }

}
