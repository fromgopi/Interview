package com.example.serialization;

import java.io.Serializable;

public class Student implements Serializable{

	int id;
	String name;
	Student(int ID, String Name){
		this.id = ID;
		this.name = Name;
	}
}
