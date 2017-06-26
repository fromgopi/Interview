package com.example.oops;

public class Boy extends Human {

	private int legs, hands = 0;;
	Boy(int legs, int hands){
		super(legs);
		this.hands = hands;
		this.legs = legs;
		System.out.println("Boy has "+hands+" hands and "+legs+" Legs");
	}
	void talk(){
		System.out.println("Boy is talking...");
	}
}
