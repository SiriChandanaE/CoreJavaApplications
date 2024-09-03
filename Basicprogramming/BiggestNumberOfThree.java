package com.evergent.coreJAVA.Basicprogramming;
public class BiggestNumberOfThree {
	public static void main(String[] args) {
		//initialize the value a
		int a=10;
		//initialize the value b
		int b=20; 
		//initialize the value c
		int c=15; 
		//Program to find largest number
		if (a>b && a>c) {
			System.out.println("Largest number is A");
		}else if (b>c) {
			System.out.println("Largest number is B");
		}else {
			System.out.println("Largest number is C");
	}
}
}