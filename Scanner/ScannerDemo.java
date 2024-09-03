package com.evergent.coreJAVA.Scanner;

import java.util.Scanner;

public class ScannerDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String name= sc.next();
		
		System.out.println("Enter a value: ");
		int a=sc.nextInt();
		
		System.out.println("Enter b value: ");
		int b=sc.nextInt();
		
		System.out.println("Name: " +name);
		System.out.println("Addition: " + (a+b));

	}

}
