package com.evergent.coreJAVA.ExceptionHandling;

public class ExceptionDemo5Final1 {
	String name="null";
	int k=0;
	public void myData() {
		try {
			System.out.println("One");
			System.out.println(name.length());
			System.out.println("End");
			
			int t=10/k;
			System.out.println(t);
		}
		catch(NullPointerException e) {
			System.out.println("I can handle: " +e);
		}
		catch(ArithmeticException e) {
			System.out.println("I can handle: " +e);
		}
		catch(Exception e) {
			System.out.println("I can handle: " +e);
		}
		finally {
			System.out.println("Finally block close condition");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo5Final1 ed2=new ExceptionDemo5Final1();
		ed2.myData();
	}
}