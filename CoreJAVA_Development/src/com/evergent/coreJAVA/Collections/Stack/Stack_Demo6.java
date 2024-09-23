package com.evergent.coreJAVA.Collections.Stack;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class Stack_Demo6 {

	public static void main(String[] args) {
		Stack<String> myStack=new Stack<>();
		myStack.push("Red");
		myStack.push("Black");
		myStack.push("White");
		System.out.println(myStack);
		
		System.out.println("Enumeration Iteration:");
		Enumeration e=myStack.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("Iterator...");
		Iterator i1=myStack.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("For Each Advance Loop");
		for(String s:myStack) {
			System.out.println(s);
		}
	}
}