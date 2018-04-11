package com.example.tree;

import java.util.LinkedList;
import java.util.List;

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

}
