package com.evergent.coreJAVA.String.Immutable;

public class MainPerson {

	public static void main(String[] args) {
		PersonImmutable person=new PersonImmutable("Raju",30);
		System.out.println("Name: " +person.myShow());
		System.out.println("Age: " +person.myAge());

	}

}
