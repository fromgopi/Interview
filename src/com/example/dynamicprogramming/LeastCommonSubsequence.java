/**
 * 
 */
package com.example.dynamicprogramming;

/**
 * Least Common Subsequence using Dynamic Programming...
 * @author fromgopi
 *
 */
public class LeastCommonSubsequence {

	int lca(String s1, String s2){
		int m = s1.length();
		int n = s2.length();
		int res[][] = new int[m][n];
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(i == 0 || j == 0){
					res[i][j] = 0;
				}	
			}
		}
		return m;
	}
}
