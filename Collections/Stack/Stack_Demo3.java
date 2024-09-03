package com.evergent.coreJAVA.Collections.Stack;
//d.Search(): To find the index value of an element from the stack.
import java.util.Stack;
public class Stack_Demo3 {

	public static void main(String[] args) {
		Stack myStack=new Stack();
		myStack.push("Red");
		myStack.push("Black");
		myStack.push("White");
		System.out.println(myStack.search("White"));
		System.out.println(myStack);
	}

}
