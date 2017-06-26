package com.example.oops;

public class Employee extends Person{

	private int empId;
	public Employee(String n, int a, int id) {
		super(n, a);
		// TODO Auto-generated constructor stub
		this.empId = id;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		if(empId == 0){
			System.out.println("Not Working....");
		}else{
			System.out.println("Working as employee...");
		}
	}

	public static void main(String args[]){
		Person p = new Employee("Gopi", 15, 1454);
		p.work();
		System.out.println(p.toString());
	}
}
