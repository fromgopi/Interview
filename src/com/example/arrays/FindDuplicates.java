package com.example.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicates {

	boolean find(int a[]){
		Set<Integer> s = new HashSet<>();
		for(int n : a){
			if(s.contains(n)){
				return true;
			}
			s.add(n);
		}
		return false;
	}
	
}
