package com.example.oops;

public abstract class Person {

	private String name;
	private int age;
	
	public Person(String n, int a) {
		// TODO Auto-generated constructor stub
		this.name = n;
		this.age = a;
	}
	
	public abstract void work();
	
	public String toString(){
		return "Name="+this.name;
	}
	
	void changeName(String n){
		this.name = n;
	}
}
