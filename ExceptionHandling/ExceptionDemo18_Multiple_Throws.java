package com.evergent.coreJAVA.ExceptionHandling;
//Handling Multiple Exceptions with throws.
public class ExceptionDemo18_Multiple_Throws {
	String name="null";
	int k=0;
	public void myData() throws NullPointerException, ArithmeticException{
		System.out.println("ONE");
		System.out.println(name.length());
		
		int d=10/k;
		System.out.println(d);
		System.out.println("End");
	}

	public static void main(String[] args) {
		try {
			ExceptionDemo18_Multiple_Throws ed1=new ExceptionDemo18_Multiple_Throws();
			ed1.myData();
		}
		catch(Exception e) {
			System.err.println("I can handle: " +e);
		}
	}

}
