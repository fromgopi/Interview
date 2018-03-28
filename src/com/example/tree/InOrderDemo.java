package com.example.tree;

public class InOrderDemo {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.addNode(8);
        bt.addNode(5);
        bt.addNode(4);
        bt.addNode(9);
        bt.addNode(7);
        bt.addNode(11);
        bt.addNode(1);
        bt.addNode(12);
        bt.addNode(3);
        bt.addNode(2);

        InOrder io = new InOrder();

        PostOrder po = new PostOrder();

        po.recursivePostOrder(bt.root);

        //io.inOrderIt(bt.root);
    }
}
