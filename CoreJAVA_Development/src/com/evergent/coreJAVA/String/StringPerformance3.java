package com.evergent.coreJAVA.String;

public class StringPerformance3 {

	public static void main(String[] args) {
		//String a;
		//String b;
		String Series="";
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);
			Series=Series+ch;
		}
		System.out.println(Series);


	}

}
