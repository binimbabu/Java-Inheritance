package com.constructorChaining;

import com.constructorChaining.Child;

public class Test {

	public static void main(String[] args) {
		Child c = new Child(10, 20, 30, 40);
		c.f1();
		c.display();
	}

}
