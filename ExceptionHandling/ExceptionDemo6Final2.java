package com.evergent.coreJAVA.ExceptionHandling;

public class ExceptionDemo6Final2 {
	String name=null;
	public void myData() {
		try {
			System.out.println("One");
			System.out.println(name.length());
			System.out.println("End");

		}
		/*
		catch(NullPointerException e) {
			System.out.println("I can handle: " +e);
		}
				catch(ArithmeticException e) {
			System.out.println("I can handle: " +e);
		}
		catch(Exception e) {
			System.out.println("I can handle: " +e);
		}
		*/
		finally {
			System.out.println("Finally block close condition");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo6Final2 ed2=new ExceptionDemo6Final2();
		ed2.myData();
	}
}