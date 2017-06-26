package com.example.arrays;

import java.util.LinkedList;
import java.util.List;

public class TopKFrequentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopKFrequent tk = new TopKFrequent();
		int a[] = {1,1,2,2,3,5,6};
		List<Integer> out = new LinkedList<>();
		out = tk.find(a, 1);
		System.out.println(out);
	}

}
