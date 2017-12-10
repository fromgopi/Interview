package com.example.PQ;
import java.sql.Timestamp;

public class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private Timestamp loginTime;
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Timestamp getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Timestamp loginTime) {
		this.loginTime = loginTime;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + name + ", Age=" + age + ", Login Time=" + loginTime + "]";
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, int age, Timestamp timeStamp) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.loginTime = timeStamp;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	
	@Override
	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
