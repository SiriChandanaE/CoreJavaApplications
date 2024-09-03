package com.evergent.coreJAVA.Constructor;

public class Student9 {
	String name;
	int age;
	
	public Student9(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public Student9(Student9 s) {
		this.name=s.name;
		this.age=s.age;
	}
	
	public void DisplayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}

	public static void main(String[] args) {
		Student9 student1=new Student9("Siri", 20);
		Student9 student2=new Student9(student1);
		student1.DisplayDetails();
		student2.DisplayDetails();
	}

}
