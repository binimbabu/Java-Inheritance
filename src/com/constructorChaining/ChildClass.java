package com.constructorChaining;

public class ChildClass extends SuperClass {
	ChildClass() {
		this(10);
		System.out.println("Child class no args");
	}
	ChildClass(int x) {
		super(x);
		System.out.println("Child class 1 args");
	}
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		
	}
}
