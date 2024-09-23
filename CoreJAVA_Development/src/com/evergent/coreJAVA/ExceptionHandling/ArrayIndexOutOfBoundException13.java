package com.evergent.coreJAVA.ExceptionHandling;

public class ArrayIndexOutOfBoundException13 {
	public static void main(String[] args) {
        int num[]= {1,2,3,4};
        try {
        	System.out.println("Accessing elements at index 5: " + num[5]);
        }catch(Exception e) {
        	System.out.println("Caught an exception:"+ e);
        }
	}
}
