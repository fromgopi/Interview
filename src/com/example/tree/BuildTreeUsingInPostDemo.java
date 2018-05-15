package com.example.tree;

public class BuildTreeUsingInPostDemo {

    public static void main(String[] args) {

        int[] inOrder = {9,3,15,20,7};
        int[] postOrder = {9,15,7,20,3};

        BuildTreeUsingInPost inPost = new BuildTreeUsingInPost();

        inPost.buildTree(inOrder, postOrder);

    }
}
