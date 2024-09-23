package com.evergent.coreJAVA.Collections.Stack;
import java.util.Stack;
public class Stack_Demo5 {
	public static void main(String[] args) {
	
		Stack<String> myStack=new Stack();
		//Pushing elements into stack
		myStack.push("Appple");
		myStack.push("Banana");
		myStack.push("Cherry");
		myStack.push("Date");
		//Displaying the stack
		System.out.println(myStack);
		//Peeking at the top element
		String topElement=myStack.peek();
		System.out.println("Top Element: " +topElement);
		//Popping on element from the stack
		String removedElement=myStack.pop();
		System.out.println("Stack after pop: " +removedElement);
		//Checking if the stack is Empty
		boolean isEmpty=myStack.isEmpty();
		System.out.println("Is the stack Empty:" +isEmpty);
		//Search for an element
		int Position=myStack.search("Banana");
		System.out.println("Position of 'Banana' from top: " +Position);
		//Clearing the stack
		System.out.println("Stack after clearing " +myStack);
	}
}