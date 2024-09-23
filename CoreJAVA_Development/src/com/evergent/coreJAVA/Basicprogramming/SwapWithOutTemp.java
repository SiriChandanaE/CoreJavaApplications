package com.evergent.coreJAVA.Basicprogramming;

public class SwapWithOutTemp {

	public static void main(String[] args) {
		//initialize the value a
		int a=10;
		//initialize the value b
		int b=20;
		a= a+b;   //a=10+20; a=30
		b= a-b;   //b=30-20; b=10
		a= a-b;   //a=30-10; a=20
		System.out.println("A is: "+a);
		System.out.println("B is: "+b);
	}

}
