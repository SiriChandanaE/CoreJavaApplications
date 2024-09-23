package com.evergent.coreJAVA.OOPS;

public class MethodFlow {
	public void Display() {
		System.out.println("Display Methods: HELLO");
		System.out.println("No Arguments with No Return type");
	}
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}

	public int myData(int a, int b) {
		return (a*b);
	}
	
	public int myChange() {
		return 100;
	}
	
	
	public static void main(String[] args) {
		MethodFlow mf=new MethodFlow();
		mf.Display();
		mf.add(3, 17);
		int k= mf.myData(5,5);
		System.out.println(k);
		int t= mf.myChange();
		System.out.println(t);

	}

}
