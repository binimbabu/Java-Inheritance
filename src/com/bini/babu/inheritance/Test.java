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
