package com.bini.babu.inheritance;

public class Developer extends Employee {
    String technology;
	public Developer(int id, String name, String dept, double salary, String technology) {
		super(id, name, dept, salary);
		System.out.println("inside Developer constructor");
		this.technology = technology;
	}
	@Override
	protected void work() {
		super.work();
		System.out.println("Developer is working using  " + technology);
	}
}
