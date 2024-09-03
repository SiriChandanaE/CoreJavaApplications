package com.evergent.coreJAVA.ObjectClassMethod;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "Name: " +name+ ", Age: " +age;
	}
}

public class MyPerson {

	public static void main(String[] args) {
		Person p1=new Person("Bhanu", 20);
		System.out.println(p1);
		System.out.println(p1.hashCode());
	}

}
