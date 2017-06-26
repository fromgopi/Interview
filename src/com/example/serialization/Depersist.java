package com.example.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Depersist {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ObjectInputStream In = new ObjectInputStream(new FileInputStream("obj.txt"));
		Student s = (Student)In.readObject();

		System.out.println(s.id + " , " + s.name);
		In.close();
	}

}
