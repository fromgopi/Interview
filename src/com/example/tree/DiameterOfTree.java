package com.example.tree;

public class DiameterOfTree {

    int diameter(Node root){
        if (root == null){
            return  -1;
        }
        int ans[] = new int[]{Integer.MIN_VALUE};
        helper(root, ans);
        return ans[0] - 1;
    }

    private int helper(Node root, int[] ans) {

        if(root == null){
            return -1;
        }
        int left = helper(root.left, ans);
        int right = helper(root.right, ans);

        ans[0] = Math.max(ans[0], left + right + 1);

        return Math.max(left, right) + 1;

    }

}
