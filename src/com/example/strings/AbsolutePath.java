package com.example.strings;

import java.util.Stack;

public class AbsolutePath {

	int abs(int n){
		int res=0;
		while(n != 0){
			res = res * 10;
			System.out.println(res);
			res = res + n%10;
			n = n/10;
		}
		return res;
	}
}

