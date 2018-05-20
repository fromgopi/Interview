package com.example.tree;

public class DFSDemo {

    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        bt.insert(4);
        bt.insert(5);
        bt.insert(6);
        bt.insert(7);

        DFSOnTree d = new DFSOnTree();
        System.out.println(d.dFs(bt.root));

        d.dfs(bt.root);
    }
}
