package com.evergent.coreJAVA.Static1;
//Static methods cannot access non-static variables and static methods

public class StaticDemo3 {
	static String cname="India";
		   String name="Siri";
	
	static public void myData() {
		//Cannot make a static reference to the non-static method myShow() from the type StaticDemo3
		//myShow();
		System.out.println("MyData");
	}
	
	public void myShow() {
		System.out.println("Name: "+name);
	}

	public static void main(String[] args) {
		System.out.println(cname);
		myData();
	}

}
