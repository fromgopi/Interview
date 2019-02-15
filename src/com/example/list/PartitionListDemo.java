package com.example.list;

public class PartitionListDemo {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.add(6);
        ll.add(5);

        PartitionList p = new PartitionList();

        Node result = p.doPartition(ll.head, 3);

        // TODO Auto-generated method stub
        Node t = result;
        while(t != null){
            System.out.print(t.data + ",");
            t = t.next;
        }
        System.out.println();

    }

}
