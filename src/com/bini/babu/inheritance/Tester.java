package com.bini.babu.inheritance;

public class Tester extends Employee {
	String[] tools;
	public Tester(int id, String name, String dept, double salary) {
		super(id, name, dept, salary);
	}

	@Override
	protected void work() {
		super.work();
		System.out.println("Tester is testing ");
		for(int i = 0; i< tools.length; i++ ) {
			System.out.println(tools[i]);
		}
	}
}
