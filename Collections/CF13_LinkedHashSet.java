package com.evergent.coreJAVA.Collections;
import java.util.LinkedHashSet;
public class CF13_LinkedHashSet {

	public static void main(String[] args) {
		//Creating a LinkedHashset
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		//Adding elements to the LinkedHashSet
		lhs.add("Apple");
		lhs.add("Banana");
		lhs.add("Orange");
		lhs.add("Mango");
		lhs.add("Grapes");
		//Displaying the LinkedHashSet
		System.out.println("LinkedHashSet: " +lhs);
		//Iterating through the LinkedHashSet
		System.out.println("Iterating over LinkedHashSet:");
		for(String fruit:lhs){
			System.out.println(fruit);
		}
		//Checking if the set contains an element: Return true if this set contains the specified
		System.out.println("Contains 'Mango': " + lhs.contains("Mango"));
		//Removing an element
		lhs.remove("Banana");
		System.out.println("After removing 'Banana': " +lhs);
		//Checking the size of the LinkedHashSet
		System.out.println("Size of LinkedHashSet: " +lhs.size());
		//To clear the elements of LinkedHashSet
		lhs.clear();
		System.out.println("After clearing: " +lhs);
	}

}
