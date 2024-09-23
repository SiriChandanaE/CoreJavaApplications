package com.evergent.coreJAVA.Static1;
//Static Blocks

public class StaticDemo5 {

	static {
		System.out.println("Static Blocks");
	}
	static String cname="India";
	
	static public void myData() {
		System.out.println("MyData");
	}

	public static void main(String[] args) {
		System.out.println(cname);
		myData();
	}

}
