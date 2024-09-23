package com.evergent.coreJAVA.OOPS;

class OverRidingDemo{
	public void myData() {
		System.out.println("Super Class Method");
	}
}

public class MyDataInfo extends OverRidingDemo{
	public void myData() {
		System.out.println("Sub Class Method");
	}

	public static void main(String[] args) {
		MyDataInfo md= new MyDataInfo();
		md.myData();

	}

}
