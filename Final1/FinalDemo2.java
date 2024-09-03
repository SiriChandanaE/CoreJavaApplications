package com.evergent.coreJAVA.Final1;
//Final methods can't be override

class MyClass{
	final public void myProducts() {
		System.out.println("All Products");
	}
}

public class FinalDemo2 extends MyClass {
	final String name="India";
	//Cannot override the final method from MyClass
	//public void myProducts() {
	public void myProducts1() {
		//The final field FinalDemo1.name cannot be assigned
		//name="Welcome";
		System.out.println("New Products");
	}
public void myData() {
	System.out.println(name);
}
	public static void main(String[] args) {
		FinalDemo2 fd1=new FinalDemo2();
		fd1.myData();
		fd1.myProducts();
		//fd1.myProducts1();

	}

}
