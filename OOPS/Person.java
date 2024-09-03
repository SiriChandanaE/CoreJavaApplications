package com.evergent.coreJAVA.OOPS;

public class Person {
	String Name = "Siri";
	int age = 20;
	String Address = "Hyderabad";
	
	public void Display() {
		System.out.println("Name: "+Name);
		System.out.println("Age: "+age);
		System.out.println("Address: "+Address);
	}

	public static void main(String[] args) {
		Person p= new Person();
		p.Display();

	}

}
