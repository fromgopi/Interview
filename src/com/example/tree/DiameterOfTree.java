package com.example.tree;

public class DiameterOfTree {

    public int diameter(Node root){
        int max = maxDepth(root);
        return max;

    }

    private int maxDepth(Node root) {
        int max=0;
        if(root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        max = Math.max(max, (left+right));
        return max;
    }

}
