package com.example.tree;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {

    boolean isSymmetric(Node root){

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while (!queue.isEmpty()){
            Node left = queue.poll();
            Node right = queue.poll();
            if(left == null || right == null){
                return true;
            }else if(left == null || right == null || left.data != right.data){
                return false;
            }else if(left != null || right != null){
                queue.offer(left.left);
                queue.offer(right.right);
                queue.offer(left.right);
                queue.offer(right.left);
            }
            System.out.println();

        }
        return false;
    }


    boolean isMinior(Node root){

        if((root == null) || (root.left == null && root.right == null)){
            return true;
        }
        return helper(root.left, root.right);
    }

    private boolean helper(Node left, Node right) {

        Queue<Node> leftQ = new LinkedList<>();
        Queue<Node> rightQ = new LinkedList<>();

        leftQ.add(left);
        rightQ.add(right);

        while (!leftQ.isEmpty() && !rightQ.isEmpty()){
            Node l = leftQ.peek();
            Node r = rightQ.peek();
        }
        return false;
    }

}
