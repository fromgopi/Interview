package com.example.hash;

import java.util.Scanner;

public class AddressBookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressBook ab = new AddressBook();
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("1. Add Address\t 2. Get Address\t 3. Display\t 4. Exit\n");
			int c = sc.nextInt();
			switch (c) {
			case 1:
				System.out.println("Enter Name");
				String key = sc.next();
				System.out.println("Phone numbe");
				String val = sc.next();
				ab.add(key, val);
				break;
			case 2:
				try{
					System.out.println("Enter Name ");
					String k = sc.next();
					System.out.println("The value for the "+k+" is " + ab.getAddress(k));
					break;
				}catch(Exception i){
					i.printStackTrace();
				}
				
			case 3:
				System.out.println("Contents ");
				ab.book.display();
				break;
			case 4: 
				return;
			default:
				break;
			}
			
		}
	}

}
