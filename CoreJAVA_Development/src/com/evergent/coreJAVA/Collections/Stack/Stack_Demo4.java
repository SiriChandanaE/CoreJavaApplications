package com.evergent.coreJAVA.Collections.Stack;
//e.isEmpty(): To check if the stack is empty.
//f.Clear(): To clear values from stack.
import java.util.Stack;
public class Stack_Demo4 {

	public static void main(String[] args) {
		Stack myStack=new Stack();
		myStack.push("Red");
		myStack.push("Black");
		myStack.push("White");
		boolean b=myStack.isEmpty();
		System.out.println(b);
		System.out.println(myStack);
	}

}
