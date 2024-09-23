package com.evergent.coreJAVA.ExceptionHandling;

public class MyOutOfMemory17 {
	public static void main(String[] args) {
		Integer[] array = new Integer[1000000 * 1000000];
		System.out.println(array);
	}
}