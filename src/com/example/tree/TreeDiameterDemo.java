package com.example.tree;

public class TreeDiameterDemo {

    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        bt.insert(5);
        bt.insert(6);
        bt.insert(12);
        bt.insert(14);
        bt.insert(1);
        bt.insert(8);

        DiameterOfTree dia = new DiameterOfTree();

        System.out.println("dia = " + dia.diameter(bt.root));
    }

}
