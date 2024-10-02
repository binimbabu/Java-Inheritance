package com.bini.babu;

public class Parent {
	
	Parent() {
		System.out.println("Parent contructor" + this); // 'this' points to the memory location
	}
	void f1() {
		System.out.println("Inside parent f1");
	}
}
