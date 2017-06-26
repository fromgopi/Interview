package com.example.hash;

public class AddressBook {

	HashMap<String, String> book = new HashMap<>(100);
	
	void add(String key, String val){
		book.put(key, val);
	}
	
	String getAddress(String key){
		return book.get(key);
	}
}
