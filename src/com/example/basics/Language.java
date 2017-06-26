package com.example.basics;

import java.util.ArrayList;

public class Language implements Cloneable {

	String name;
	public Language(String n) {
		// TODO Auto-generated constructor stub
		this.name = n;
	}
	
	 public String getName() {
	        return name;
	    }
	 
	 @Override
	    protected Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }
	 public static void main(String args[]) throws ClassNotFoundException, CloneNotSupportedException{

	      ArrayList<Language> list=new ArrayList<Language>();
	      list.add(new Language("C"));
	      list.add(new Language("JAVA"));

	      ArrayList<Language> shallow=(ArrayList<Language>) list.clone();
	      //We used here clone since this always shallow copied.

	      System.out.println(list==shallow);

	      for(int i=0;i<list.size();i++)
	      System.out.println(list.get(i)==shallow.get(i));//true

	      ArrayList<Language> deep=new ArrayList<Language>();
	      for(Language language:list){
	          deep.add((Language) language.clone());
	      }
	      System.out.println(list==deep);
	      for(int i=0;i<list.size();i++)
	          System.out.println(list.get(i)==deep.get(i));//false

	} 
}
