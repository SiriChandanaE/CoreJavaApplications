package com.evergent.coreJAVA.OOPS;

public class Calculation {
	int a=10, b=20, c;
	public void Addition() {
		c=a+b;
		System.out.println("Addition: " +c);
	}
	public static void main(String[] args) {
		Calculation cal=new Calculation();
		cal.Addition();
		
	}

}
