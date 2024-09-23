package com.evergent.coreJAVA.Collections.Stack;
//a.Push(): Adding value into stack.
//b.Pop(): Remove values from slack.
import java.util.Stack;
public class Stack_Demo1 {

	public static void main(String[] args) {
		Stack myStack=new Stack();
		myStack.push("Red");
		myStack.push("Black");
		myStack.push("White");
		System.out.println(myStack);
		System.out.println(myStack.pop());
	}

}
