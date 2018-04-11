package com.example.tree;

import java.util.List;

public class BinaryTreePathDemo {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.insert(1);
        bt.insert(110);
        bt.insert(30);
        bt.insert(40);
        bt.insert(14);
        bt.insert(140);
        bt.insert(113);

        BinaryTreePath bPath = new BinaryTreePath();


        List<String> res = bPath.findPath(bt.root);
        
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }

    }
}
