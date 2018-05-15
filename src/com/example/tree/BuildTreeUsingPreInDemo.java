package com.example.tree;

public class BuildTreeUsingPreInDemo {

    public static void main(String[] args) {

        BuildTreeUsingPreIn pre = new BuildTreeUsingPreIn();
        int preOrder[] = {3,9,20,15,7};
        int inOrder[] = {9,3,15,20,7};
        Node res = pre.construct(preOrder, inOrder);

        System.out.println(res.left.data);

    }
}
