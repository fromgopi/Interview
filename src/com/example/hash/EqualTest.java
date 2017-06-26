package com.example.hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EqualTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.setId(100);
		e2.setId(100);
		List<Employee> e= new ArrayList<>();
		e.add(e1);
		System.out.println(e);
		Set<Employee> employees = new HashSet<Employee>();
		employees.add(e1);
		employees.add(e2);
		
		System.out.println(employees);
	}

}
