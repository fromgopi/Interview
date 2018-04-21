package com.example.list;

import java.util.HashSet;
import java.util.Set;

public class LinkedListComponents {

    public int findComponent(Node head, int[] component){

        Set<Integer> set = new HashSet<>();
        for(int i : component){
            set.add(i);
        }
        int count = 0;

        while (head != null){
            Node cur = head;
            boolean found = false;
            while (cur != null && set.contains(cur.data)){
                found = true;
                cur = cur.next;
            }
            if(found){
                count ++;
            }

            head = cur == null ? cur : cur.next;

        }

        return count;
    }

}
