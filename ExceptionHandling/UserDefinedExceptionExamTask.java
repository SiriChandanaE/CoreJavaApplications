package com.evergent.coreJAVA.ExceptionHandling;

class InvalidQuantityException extends Exception{
	public InvalidQuantityException(String message) {
		super(message);
	}
}
public class UserDefinedExceptionExamTask{
	public static void checkQuantity(int quantity) throws InvalidQuantityException{
    	if(quantity <0) {
			throw new InvalidQuantityException("Entered quantity is not valid");
		} else {
			System.out.println("Entered quantity is valid");
		}
	}
	public static void main(String[] args) {
		try {
			checkQuantity(-1);
		}
		catch(InvalidQuantityException e){
			System.out.println("InvalidQuantityException: "+ e.getMessage());
			System.out.println(e);
	    }
		System.out.println("Program continues after handling exception");
}
}