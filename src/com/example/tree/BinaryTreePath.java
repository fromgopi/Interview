package com.example.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePath {


    public List<String> findPath(Node root){

        List<String> paths = new LinkedList<String>();

        if(root == null){
            return paths;
        }

        if(root.left == null || root.right == null){
            paths.add(root.data+"");
            return paths;
        }

        for(String path : findPath(root.left)){
            paths.add(root.data + " -> " + path);
        }

        for(String path : findPath(root.right)){
            paths.add(root.data + " -> " + path);
        }

        return paths;
    }

    boolean hasPathSum(Node root, int sum){

        if (root.data == sum){
            return true;
        }

        Stack<Node> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()){
            Node temp = s.pop();

            if(temp.right != null){
                s.push(temp.right);
            }

        }

        return false;
    }

}
