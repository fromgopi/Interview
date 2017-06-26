package com.example.strings;

public class CompressString {

	String compress(String s){
		
		StringBuilder sb = new StringBuilder();
		char prevChar = s.charAt(0);
		int counter=0;
		char currChar;
		for(int i=0;i<s.length();i++){
			currChar = s.charAt(i);
			if(currChar == prevChar){
				counter++;
				if(i == s.length()-1){
					sb.append(currChar);
					sb.append(counter);
				}
				continue;
			}else{
				sb.append(prevChar);
				sb.append(counter);
				prevChar = currChar;
				counter=1;
			}
			
		}
		return sb.toString();
	}
	
	public String compressString(String data){
		StringBuilder outBuilder = new StringBuilder(); 
		char prevChar = data.charAt(0); 
		int counter = 0; char currChar; 
		int length = data.length(); 
		for(int i=0; i< length; i++){ 
			currChar = data.charAt(i); 
			if(currChar == prevChar)
			{ counter++; 
			// For the last unique characters 
			if(i == length-1){
				outBuilder.append(currChar); 
				outBuilder.append(counter); 
				}
			continue; 
			}
			else { 
				outBuilder.append(prevChar); 
				outBuilder.append(counter); 
				prevChar = currChar; counter=1; }
		} 
		return outBuilder.toString(); 
	}
	 	
	
	public static void main(String args[]){
		CompressString css = new CompressString();
		String s = css.compress("aaabbcc");
		System.out.println(s);
	}
	
}


	
		