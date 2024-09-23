package com.evergent.CoreJAVA.RAM.Application3;

public class BankRBI {
	static {
		System.out.println("Welcome to Employee Details");
	}
	public BankRBI() {
		System.out.println("RBI Bank Home Loan and Perosnal Loan Interest");
	}
	public BankRBI(double p, double r) {
		System.out.println(p*r/100);
	}
	public static final void getBankDetails(){
		System.out.println("Home Loan Interest is 8.5");
		System.out.println("Personal Loan Interest is 11 percent");
	}
}
