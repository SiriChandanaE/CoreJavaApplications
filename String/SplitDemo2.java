package com.evergent.coreJAVA.String;

public class SplitDemo2 {

	public static void main(String[] args) {
		String str="Java is a programming language";
		String[] words=str.split(" ");
		
		
		for (String w: words)
			System.out.println(w);

	}

}
