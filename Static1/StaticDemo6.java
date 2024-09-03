package com.evergent.coreJAVA.Static1;
//If a static variable is modified, then it will reflected globally

public class StaticDemo6 {
	static String name="Siri";
		        int age= 20;
		   String address="Hyderabad";
	
	public void Display() {
		name="Welcome";
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Address: "+address);
	}

	public static void main(String[] args) {
		StaticDemo6 s6=new StaticDemo6();
		System.out.println(s6.name);
		s6.Display();
		StaticDemo6 s7=new StaticDemo6();
		System.out.println(s7.name);
	}

}
