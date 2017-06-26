package com.example.hash;

public class HashNode<Object, V> {

	Object key;
	V val;
	HashNode<Object,V> next;
	
	public HashNode(Object key, V val) {
		// TODO Auto-generated constructor stub
		this.key = key;
		this.val = val;
		this.next = null;
	}
	
}
