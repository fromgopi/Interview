package com.example.serialization;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persist {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Student s = new Student(121, "Gopi Krishna");
		FileOutputStream fo = new FileOutputStream("obj.txt");
		ObjectOutputStream Out = new ObjectOutputStream(fo);
		Out.writeObject(s);
		Out.flush();
		System.out.println("Done...");
	}

}
