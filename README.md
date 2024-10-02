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



package com.bini.babu.inheritance;

public class Manager extends Employee {
	String[] projects;

	public Manager(int id, String name, String dept, double salary, String[] projects) {
		super(id, name, dept, salary);
		System.out.println("inside Manager constructor");
		this.projects = projects;
	}

	@Override
	protected void work() {
		super.work();
		System.out.println("Manager is managing ");
		for(int i = 0; i< projects.length; i++ ) {
			System.out.println(projects[i]);
		}
	}

}



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



package com.bini.babu.inheritance;

public class Test {

	public static void main(String[] args) {
	String[] projects = new String[] { "Pan-portal", "Able-angular"};
     Manager manager = new Manager(1, "Bini", "Software", 100000, projects);
     System.out.println(manager.name);
     System.out.println(manager.dept);
     System.out.println(manager.salary);
     manager.work();
     
     System.out.println();
     System.out.println();
     Developer developer = new Developer(1, "Bini", "Software", 100000, "Angular");
     System.out.println(manager.name);
     System.out.println(manager.dept);
     System.out.println(manager.salary);
     developer.work();
	}

}



Output

Software
100000.0
Common work for everyone
Manager is managing 
Pan-portal
Able-angular


inside Employee constructor
inside Developer constructor
Bini
Software
100000.0
Common work for everyone
Developer is working using  Angular




When a method is declared final then that method cannot be overridden. When you want to inherit a class and not override it then we use 'final'.


