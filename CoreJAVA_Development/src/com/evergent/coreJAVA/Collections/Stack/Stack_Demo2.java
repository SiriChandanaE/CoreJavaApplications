package com.evergent.coreJAVA.Collections.Stack;
//c.Peek(): Last element value is shown.
import java.util.Stack;
public class Stack_Demo2 {

	public static void main(String[] args) {
		Stack myStack=new Stack();
		myStack.push("Red");
		myStack.push("Black");
		myStack.push("White");
		System.out.println(myStack);
		System.out.println(myStack.peek());
		System.out.println(myStack);
	}

}
