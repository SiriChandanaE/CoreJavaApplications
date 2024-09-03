package com.evergent.coreJAVA.ExceptionHandling;

public class ExceptionDemo8throws2 {
	String name=null;
	int k=0;
	public void myData() throws NullPointerException{
		System.out.println("ONE");
		System.out.println(name.length());
		System.out.println("End");
	}
	
	public void myChange() throws NullPointerException{
		myData();
		System.out.println("MyChange method");
	}

	public static void main(String[] args) {
		try {
			ExceptionDemo8throws2 ex1=new ExceptionDemo8throws2();
			ex1.myChange();
		}
		catch(Exception e) {
			System.err.println("I can handle: " +e);
		}
	}

}
