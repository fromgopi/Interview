package com.example.strings;

public class EditDistance {

	int edit(String s1, String s2){
		int d[][] = new int[s1.length()+1][s2.length()+1];
		if(s1.equals(s2)){
			return 0;
		}
		if(s1.length() == 0 && s2.length() == 0){
			return Math.abs(s1.length()-s2.length());
		}
		for(int i=1;i<=s1.length();i++){
			d[i][0] = i;
		}
		for(int j=1;j<=s2.length();j++){
			d[0][j] = j;
		}
		
		for(int  i=1;i<s1.length();i++){
			for(int j=1;j<s2.length();j++){
				if(s1.charAt(i-1) == s2.charAt(j-1)){
					d[i][j] = d[i-1][j-1]; 
				}else{
					d[i][j] = Math.min(d[i-1][j-1], Math.min(d[i-1][j], d[i][j-1])) + 1;
				}
			}
		}
		return d[s1.length()][s2.length()];
	}
	
}
