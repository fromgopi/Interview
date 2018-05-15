package com.example.tree;

public class SymmetricTreeDemo {

    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();
        bt.insert(1);
        bt.insert(2);
        bt.insert(2);
        bt.insert(3);
        bt.insert(4);
        bt.insert(4);
        bt.insert(4);

        SymmetricTree st = new SymmetricTree();

        System.out.println(st.isSymmetric(bt.root));

    }

}
