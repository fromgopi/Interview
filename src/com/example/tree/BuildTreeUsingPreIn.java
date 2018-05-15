package com.example.tree;

import java.util.Stack;

public class BuildTreeUsingPreIn {

    Node construct(int[] preOrder, int[] inOrder){

        if(inOrder.length == 0){
            return null;
        }
        Stack<Node> stack = new Stack<>();
        Node root = new Node(preOrder[0]);
        int j=0;int i=0;
        Node current = root;
        Node node = null;
        stack.push(root);
        while(j<inOrder.length){
            if(stack.peek().data == inOrder[j]){
                node = stack.pop();
                j++;
            }else if (node != null){
                current = new Node(preOrder[i]);
                node.right = current;
                node=null;
                stack.push(current);
                i++;
            }
            else{
                current = new Node(preOrder[i]);
                stack.peek().left = current;
                stack.push(current);
                i++;
            }
        }
        return root;
    }

}
