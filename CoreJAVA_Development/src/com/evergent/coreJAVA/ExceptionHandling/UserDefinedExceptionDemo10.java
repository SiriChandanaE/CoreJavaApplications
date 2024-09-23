package com.evergent.coreJAVA.ExceptionHandling;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class UserDefinedExceptionDemo10{
	public static void checkAge(int age) throws InvalidAgeException{
    	if(age<18) {
			throw new InvalidAgeException("Age must be 18 or older");
		} else {
			System.out.println("Access granted - you are old enough");
		}
	}
	public static void main(String[] args) {
		try {
			checkAge(16);
		}catch(InvalidAgeException e){
			System.out.println("InvalidAgeException: "+ e.getMessage());
			System.out.println(e);
	    }
		System.out.println("program continues after handling exception");
}
}