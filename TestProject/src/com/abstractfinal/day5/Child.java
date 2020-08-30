package com.abstractfinal.day5;

public class Child extends AbstractExample{
	public void display() {
		System.out.println("iam in display method");
	}
	public static void main (String args[]) {
		Child c = new Child();
		c.display();
		c.show();
		
	}

}
