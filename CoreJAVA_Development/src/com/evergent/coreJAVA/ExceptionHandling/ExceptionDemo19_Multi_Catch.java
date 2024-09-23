package com.evergent.coreJAVA.ExceptionHandling;
//Handling Multiple Exceptions using multi-catch.
public class ExceptionDemo19_Multi_Catch {
	String name="null";
	int k=0;
	public void myData(){
		try {
		System.out.println("ONE");
		System.out.println(name.length());
		
		int d=10/k;
		System.out.println(d);
		System.out.println("End");
		}
		catch(NullPointerException | ArithmeticException e) {
			System.err.println("I can handle: " +e);
		}
		}
	public static void main(String[] args) {
		ExceptionDemo19_Multi_Catch ed1= new ExceptionDemo19_Multi_Catch();
		ed1.myData();
	}

}
