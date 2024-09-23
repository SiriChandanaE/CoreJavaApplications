package com.evergent.coreJAVA.WrapperClasses;

public class Autoboxing_Unboxing3 {

	public static void main(String[] args) {
		//Autoboxing of Characters
		char ch='a';
		Character ch1=new Character(ch);
		//Auto-unboxing of Characters
		char ch2=ch1.charValue();
		System.out.println("Value of ch1: " +ch1);
		System.out.println("Value of ch2: " +ch2);
	}

}
