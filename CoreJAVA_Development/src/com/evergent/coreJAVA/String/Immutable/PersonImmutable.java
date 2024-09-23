package com.evergent.coreJAVA.String.Immutable;

public class PersonImmutable {
	private final String name;
	private final int age;
	
	//Constructor to initializes the final fields
	public PersonImmutable(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String myShow() {
		return name;
	}
	
	public int myAge() {
		return age;
	}

}
