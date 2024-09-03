package com.evergent.coreJAVA.ExceptionHandling;

class InvalidScoreException extends RuntimeException{
	public InvalidScoreException(String message) {
		super(message);
	}
}
public class UserDefinedUncheckedExceptionsDemo12{
	public static void validateScore(int score) throws InvalidScoreException{
    	if(score < 0 || score > 100) {
			throw new InvalidScoreException("Score must be between 0 & 100");
		} else {
			System.out.println("Score is valid");
		}
	}
	public static void main(String[] args) {
		try {
			validateScore(600);
		}catch(InvalidScoreException e){
			System.out.println("InvalidScoreException: "+ e.getMessage());
			System.out.println(e);
	    }
		System.out.println("program continues after handling exception");
}
}
