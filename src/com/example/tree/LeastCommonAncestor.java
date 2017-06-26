package com.example.tree;

public class LeastCommonAncestor {

	static int recCount = 0;
	
	Node lca(Node root, Node n1, Node n2){
		System.out.println("Recursion Count = " + recCount + " , Root " + root );
		recCount++;
		
		if(root == null){
			return null;
		}
		if(root.data == n1.data || root.data == n2.data){
			System.out.println("root val " + root.data);
			return root;
		}
		
		Node left = lca(root.left, n1, n2);
		Node right = lca(root.right, n1, n2);
		if(left!=null && right!=null){
			System.out.println("Root in condition if " + root.data);
			return root;
		}
		if(left!=null){
			return left;
		}else if(right!=null){
			return right;
		}
		return null;
	}
}
