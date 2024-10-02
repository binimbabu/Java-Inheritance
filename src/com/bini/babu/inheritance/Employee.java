package com.bini.babu.inheritance;

public class Employee {
	int id;
	String name;
	String dept;
	double salary;

	public Employee(int id, String name, String dept, double salary) {
		super();
		System.out.println("inside Employee constructor");
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	protected void work() {
		System.out.println("Common work for everyone");
	}
}
