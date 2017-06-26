package com.example.oops;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		Animal animal = cat;
		Animal animal2 = new Animal();
		animal.eat();
		animal2.eat();
		List<Object> list = new ArrayList<Object>();
		list.add(animal);
		
		System.out.println();
		
	}

}
