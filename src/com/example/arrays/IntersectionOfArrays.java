package com.example.arrays;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {

	int[] intersection(int a[], int b[]){
		Set<Integer> set = new HashSet<Integer>();
		int x=0, y=0;
		while(x < a.length && y < b.length){
			if(a[x]>b[y]){
				y++;
			}else if(a[x]<b[y]){
				x++;
			}else{
				set.add(a[x]);
				x++;
				y++;
			}
		}
		int result[] = new int[set.size()];
		int k=0;
		for(int i : set){
			result[k++] = i;
		}
		return result;
	}
	
}
