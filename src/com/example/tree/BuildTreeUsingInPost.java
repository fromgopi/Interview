package com.example.tree;

import java.util.Stack;

public class BuildTreeUsingInPost {

    void buildTree(int[] inOrder, int[] postOrder){

        System.out.println(postOrder[postOrder.length-1]);
        if(inOrder.length == 0){
            System.out.println("Cannot build the tree.");
        }

        Node root = new Node(postOrder[postOrder.length-1]);
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        for(int i=postOrder.length-2, j=inOrder.length-1; i>=0;--i){
            if(stack.peek().data != inOrder[j]){
                stack.push(stack.peek().right = new Node(postOrder[i]));
                System.out.println("stack.peek().data which is right. = " + stack.peek().data);
            }else {
                Node temp = null;
                while(!stack.isEmpty() && stack.peek().data == inOrder[j]){
                    System.out.println("While loop ran for " + j + "times");
                    temp = stack.pop();
                    System.out.println("The element which is popped " + temp.data);
                    j--;
                }
                stack.push(temp.left = new Node(postOrder[i]));
            }
        }
    }

}
