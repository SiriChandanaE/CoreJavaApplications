package com.evergent.coreJAVA.OOPS;

public class MyClass extends Calculation {
	public void show() {
		System.out.println("Show Method Local Class");
	}

	public static void main(String[] args) {
		MyClass my= new MyClass();
		my.show();
		my.Addition();

	}

}
