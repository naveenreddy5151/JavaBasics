package com.abstractfinal.day5;

public class InterfaceChild1 implements InterfaceExample {
	public void show() {
		System.out.println("iam in show method");
	}
	public void display() {
		System.out.println("iam in display method");
	}
	public static void main(String args[]) {
		InterfaceChild1 ic1 = new InterfaceChild1();
		ic1.show();
		ic1.display();
	}
}
