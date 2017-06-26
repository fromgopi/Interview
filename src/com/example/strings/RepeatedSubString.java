package com.example.strings;

public class RepeatedSubString {

	int find(String s){
		char ch[] = new char[26];
		for(int i=0;i<s.length();i++){
			ch[s.charAt(i) - 'a']++;
		}
		for(int j=0;j<s.length();j++){
			System.out.println(ch[s.charAt(j)] - 'a');
		}
		return -1;
	}
	
	public static void main(String args[]){
		RepeatedSubString r = new RepeatedSubString();
		System.out.println(r.find("gggpi"));
	}
}
