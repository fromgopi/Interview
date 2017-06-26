package com.example.arrays;

public class CountIndexPairs {

	int pairs(int a[], int n){
		int ans=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i] == a[j]){
					ans++;
				}
			}
		}
		return ans;
	}
	
	public static void main(String args[]){
		CountIndexPairs cp = new CountIndexPairs();
		int a[] = {1,2,2};
		
		int n = a.length/(a.length-1);
		System.out.println(cp.pairs(a, a.length));
	}
}
