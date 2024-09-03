package com.evergent.coreJAVA.Constructor;
class Animal{
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void DisplayInfo() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}

class Dog extends Animal{
	private String breed;
	public Dog(String name, int age, String breed) {
		super(name,age);
		this.breed=breed;
	}
	
	public void DisplayInfo() {
		super.DisplayInfo();
		System.out.println("Breed: "+breed);
	}
	
}
public class Inheritance_Overriding {

	public static void main(String[] args) {
		Dog dog=new Dog("Buddy", 5, "Golden Retriever");
		dog.DisplayInfo();

	}

}
