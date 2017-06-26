package com.example.arrays;

public class RemoveInplaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveInplace r = new RemoveInplace();
		int a[] = {1,2,3,4,4,5};
		System.out.println("Len " + a.length);
		int out = r.remove(a, 1);
		System.out.println(out);
		
	}

}
