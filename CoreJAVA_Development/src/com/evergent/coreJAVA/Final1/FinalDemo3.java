package com.evergent.coreJAVA.Final1;
//Final class can.t be extended(Inheritance)

final class MyClass1{
	final public void myProducts() {
		System.out.println("All Products");
	}
}

//The type FinalDemo3 cannot subclass the final class MyClass
//public class FinalDemo3 extends MyClass {

public class FinalDemo3 {
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
		FinalDemo3 fd1=new FinalDemo3();
		fd1.myData();
		fd1.myProducts1();
		//fd1.myProducts();

	}

}
