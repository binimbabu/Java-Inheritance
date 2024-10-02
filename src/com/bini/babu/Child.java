package com.bini.babu;

public class Child extends Parent{
	
	Child(){
		System.out.println("Child" + this);  // 'this' points to the memory location
	}
	
	void f2() {
		System.out.println("Inside child f2");
	}
}
