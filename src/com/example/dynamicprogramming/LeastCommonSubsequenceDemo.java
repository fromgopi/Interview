package com.example.dynamicprogramming;

public class LeastCommonSubsequenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LeastCommonSubsequence lca = new LeastCommonSubsequence();
		String s1 ="aaaaaabbbcaagggccvsssdhhhdkjkkdhnnnjdnncjjdbbbbbbbbbdbbd";
		String s2 = "aaaaaa";
		System.out.println(lca.lca(s1, s2));
	}

}
