package com.evergent.coreJAVA.OOPS;

public class HAS_A_RelataionshipDemo {
	public void show() {
		System.out.println("Show Method");
	}

	public static void main(String[] args) {
		HAS_A_RelataionshipDemo hrd=new HAS_A_RelataionshipDemo();
		hrd.show();
		//HAS_A
		Person person = new Person();
		person.Display();

	}

}
