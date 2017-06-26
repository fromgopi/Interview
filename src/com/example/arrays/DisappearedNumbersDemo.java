package com.example.arrays;

import java.util.List;

public class DisappearedNumbersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {4,1,2,3,6,5,8,7,10,12};
		
		DisappearedNumbers d = new DisappearedNumbers();
		List<Integer> result = d.find(nums);
		System.out.println(result);
		
	}

}
