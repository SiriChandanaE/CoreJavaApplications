package com.evergent.coreJAVA.WrapperClasses;

public class WrapperClassDemo1 {

	public static void main(String[] args) {
		//Auto Data types Objects
		int a=10;
		Integer i1=new Integer(a);
		System.out.println(i1);
		
		//Object data convert into data types
		int a1= i1.intValue();
		System.out.println(a1);
	}

}
