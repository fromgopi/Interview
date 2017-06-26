package com.example.oops;

public class GarbageCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollector gc = new GarbageCollector();
		System.out.println(gc);
		gc= null;
		System.gc();
		
	}
	
	public void finalize() {
		System.out.println("Garbage collected....");
	}

}
