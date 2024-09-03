package com.evergent.coreJAVA.String;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder(" Hello");
		System.out.println("Intial string: "+ sb);

		//Append String
		sb.append("World");
		System.out.println("After Append: "+ sb);
		
		//Insert String
		sb.insert(6,"Beautiful");
		System.out.println("After Insert: "+ sb);
		
		//Replace a String
		sb.replace(0,5,"Hi");
		System.out.println("After replace: "+ sb);
		
		//Delete a String
		sb.delete(0,3);
		System.out.println("After delete: "+ sb);
		
		//Reverse String
		sb.reverse();
		System.out.println("After reverse: "+ sb);
		
	}

}
