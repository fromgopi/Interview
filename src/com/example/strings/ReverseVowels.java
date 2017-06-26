package com.example.strings;

public class ReverseVowels {

	String reverse(String s){
		/*String vowels = "aeiouAEIOU";
		char [] chars = s.toCharArray();
		int start = 0;
		int end = s.length()-1;
		while(start < end){
			while(start<end && !vowels.contains(chars[start]+"")){
				start++;
			}
			while(start<end && !vowels.contains(chars[end]+"")){
				end--;
			}
			char temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;
			start++;
			end--;
		}*/
		char chars[] = s.toCharArray();
		int freq[] = new int[256];
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			freq[c-'a']++;
			System.out.println(c+","+ (c-'a'));
		}
		return new String(chars);
	}
}
