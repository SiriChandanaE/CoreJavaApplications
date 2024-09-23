package com.evergent.coreJAVA.Static1;
//Static methods can access static variables and static methods

public class StaticDemo2 {
	static String cname="India";
	
	static public void myData() {
		System.out.println("MyData");
	}

	public static void main(String[] args) {
		System.out.println(cname);
		myData();
	}

}
