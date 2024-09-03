package com.evergent.coreJAVA.Final1;
//Final is a keyword.
//We can declare final as variables, methods, class.
//Final variable can't be modified.

public class FinalDemo1 {
	final String name="India";
	public void myData() {
		//The final field FinalDemo1.name cannot be assigned
		//name="Welcome";
		System.out.println(name);
	}

	public static void main(String[] args) {
		FinalDemo1 fd=new FinalDemo1();
		fd.myData();

	}

}
