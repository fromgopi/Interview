package com.example.arrays;

public class IntersectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,6,7,8,9,10};
		int b[] = {5,3,7,22,6,1,11};
		int out[] ;
		IntersectionOfArrays ina = new IntersectionOfArrays();
		out = ina.intersection(a, b);
		for(int i=0;i<out.length;i++){
			System.out.println(out[i] + ",");
		}
		
	}

}
