package com.evergent.coreJAVA.Basicprogramming;
public class BiggestNumberOfFive {
	public static void main(String[] args) {
		//initialize the value a
		int a=10; 
		//initialize the value b
		int b=20; 
		//initialize the value c
		int c=15; 
		//initialize the value d
		int d=17; 
		//initialize the value e
		int e=25; 
		//Program to find largest number
		if (a>b && a>c && a>d && a>e) {
			System.out.println("Largest number is A"); 
		}else if (b>c && b>d && b>e) {
			System.out.println("Largest number is B");
		}else if (c>d && c>e) {
			System.out.println("Largest number is C");
		}else if (d>e) {
			System.out.println("Largest number is D");
		}else {
			System.out.println("Largest number is E");
	}
}
}