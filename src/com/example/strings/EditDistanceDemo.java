package com.example.strings;

public class EditDistanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EditDistance ed = new EditDistance();
		System.out.println("Min Steps " + ed.edit("abc", "acdf"));
	}

}
