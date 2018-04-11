package com.example.tree;

public class BinaryTreePathSumDemo {

    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        bt.insert(1);
        bt.insert(110);
        bt.insert(30);
        bt.insert(40);
        bt.insert(14);
        bt.insert(140);
        bt.insert(113);

        BinaryTreePathSum btps = new BinaryTreePathSum();

        btps.pathSum(bt.root, 20);

    }
}
