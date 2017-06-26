package com.example.strings;


public class IsAnagram {

	boolean isAnagram(String s, String p){
		if(s.length() != p.length()){
			return false;
		}
		if(s == null || p == null || s.length() == 0 || p.length() == 0){
			return false;
		}
		int letters[] = new int[256];
		char sLetters[] = s.toCharArray();
		char pLetters[] = p.toCharArray();
		for(int i=0;i<letters.length;i++){
			letters[i] = 0;
		}
		for(char c : sLetters){
			letters[c]++;
		}
		for(char z : pLetters){
			if(letters[z] != 0){
				return false;
			}
		}
		return true;
	}
	
	void display(String s){
		for(int i=0;i<s.length();i++){
			System.out.print(s.charAt(i) + ",");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="listen";
		String p="integer";
		IsAnagram is = new IsAnagram();
		System.out.println('z' - ' ');
	}

}
