package com.constructorChaining;

public class SuperClass {
	int x;

	public SuperClass() {
		System.out.println("No args SuperClass constructor");
	}

	public SuperClass(int x) {
		this.x = x;
		System.out.println("1 args SuperClass constructor");
	}
}
