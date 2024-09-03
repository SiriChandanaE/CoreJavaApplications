package com.evergent.coreJAVA.ExceptionHandling;
public class StackOverFlowErrorExample16 {
	public static void main(String[] args) {
		try {
			recursiveMethod();
		}catch(StackOverflowError e) {
			System.out.println("StackOverflowError got caught :" + e.getMessage());
		}
	}
	public static void recursiveMethod(){
		recursiveMethod();
	}
}