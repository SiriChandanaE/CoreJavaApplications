package com.evergent.coreJAVA.ExceptionHandling;

class InsufficientFundException extends Exception{
	public InsufficientFundException(String message) {
		super(message);
	}
}
public class UserDefinedExceptionsFunds11{
	public static void withdraw(double amount) throws InsufficientFundException{
		double balance=500;
    	if(amount > balance) {
			throw new InsufficientFundException("Insufficient Balance");
		} else {
			System.out.println("Withdrawal successfull");
		}
	}
	public static void main(String[] args) {
		try {
			withdraw(600);
		}catch(InsufficientFundException e){
			System.out.println("InsufficientFundException: "+ e.getMessage());
			System.out.println(e);
	    }
		System.out.println("program continues after handling exception");
}
}