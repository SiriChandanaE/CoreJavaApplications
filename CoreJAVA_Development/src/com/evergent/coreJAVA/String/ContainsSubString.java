package com.evergent.coreJAVA.String;

public class ContainsSubString {

	public static void main(String[] args) {
		String str="The quite brown fox jumps over the lazy dog";
		//String substr="fox";
		boolean contains=str.contains("fox");
		System.out.println("Contains " + "fox" +": " +contains);

	}

}
