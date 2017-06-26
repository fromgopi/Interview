package com.example.threads;

public class Counter {

	protected long counter = 0;
	
	public void add(int val){
		this.counter = this.counter + val;
		System.out.println(this.counter);
	}
}
