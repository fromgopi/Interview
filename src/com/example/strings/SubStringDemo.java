package com.example.strings;


public class SubStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sdaaaaaaa";
		String t = "xxss";
		
		SubStringDemo ss = new SubStringDemo();
		System.out.println(ss.check(s, t));
	}

	private boolean check(String s, String t) {
		// TODO Auto-generated method stub
		char S[] = s.toCharArray();
		char T[] = t.toCharArray();
		
		int len = S.length - T.length+1;
		for(int i=0;i<len;i++){
			for(int j=0;j<T.length;j++){
				if(S[i+j] == T[j]){
					if(j == T.length-1){
						return true;
					}else{
						break;
					}
				}
			}
		}
		return false;
	}

}
