package com.example.dynamicprogramming;






public class DistinctSubsequence {

	int findSubsequence(String S, String T){
		int m = S.length();
		int n = T.length();
		int dp[][] = new int[m+1][n+1];
		
		for(int i=0;i<=m;i++){
			dp[i][0] = 1;
		}
		
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){ 
				
			}
		}
		
		return dp[m][n];
	}
	
}

