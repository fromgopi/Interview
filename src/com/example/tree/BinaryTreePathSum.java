package com.example.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePathSum {


    public List<List<Integer>> findSumPath(Node root, int sum){

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        int SUM = 0;
        Node current = root;
        Node prev = null;
        Stack<Node> stack = new Stack<>();
        while(current != null || !stack.empty()){
            while (current != null){
                stack.push(current);
                path.add(current.data);
                SUM += current.data;
                current = current.left;
            }
            current = stack.peek();
            if(current.right != null || current.right != prev){
                current = current.right;
                continue;
            }

            if(current.left == null && current.right == null && SUM == sum){
                res.add(new ArrayList<>(path));
            }

            prev = current;
            stack.pop();
            path.remove(path.size()-1);
            SUM -= current.data;
            current = null;

        }
        return res;
    }


    public List<List<Integer>> pathSum(Node root, int sum){
        List<List<Integer>> res = new ArrayList<>();

        if(root == null){
            return res;
        }

        List<Integer> currentArray = new ArrayList<>();
        hasPath(root, sum, 0, currentArray, res);

        return res;
    }

    private void hasPath(Node root, int sum, int cursum, List<Integer> curArray, List<List<Integer>> res) {

        if(root.left == null && root.right ==null) {
            cursum+=root.data;
            curArray.add(root.data);
            if(cursum == sum) {
                res.add(new ArrayList<Integer>(curArray));
            }
            curArray.remove(curArray.size()-1);
            return;
        }
        cursum+=root.data;
        curArray.add(root.data);
        if(root.left!=null)
        {
            hasPath(root.left, sum, cursum, curArray, res);
        }
        if(root.right!=null)
        {
            hasPath(root.right, sum, cursum, curArray, res);
        }
        curArray.remove(curArray.size()-1);
    }

}
