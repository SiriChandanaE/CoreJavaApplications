package com.evergent.coreJAVA.WrapperClasses;

public class WrapperClassDemo2 {

	public static void main(String[] args) {
		float f1=4.5f;
		Float f2=new Float(f1);
		Float f3=f2.floatValue();
		
		double d1=799.89;
		Double d2=new Double(d1);
		Double d3=d2.doubleValue();
		
		byte b1=10;
		Byte b2=new Byte(b1);
		Byte b3=b2.byteValue();
		
		//Float Value
		System.out.println("Float Value: " +f1);
		System.out.println("Float Object Value: " +f2);
		System.out.println("Convert Integer object value to Primitive: " +f3);
		
		//Double Value
		System.out.println("Double Value: " +d1);
		System.out.println("Double  Object Value: " +d2);
		System.out.println("Convert Double object value to Primitive: " +d3);
		
		//Byte Value
		System.out.println("Byte Value: " +b1);
		System.out.println("Byte Object Value: " +b2);
		System.out.println("Convert Byte object value to Primitive: " +b3);
	}
}