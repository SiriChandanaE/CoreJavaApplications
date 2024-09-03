package com.evergent.coreJAVA.Collections.map;
import java.util.HashMap;
public class HashmapDemo {

	public static void main(String[] args) {
		HashMap myMap=new HashMap();
		myMap.put(100, "Ramesh");
		myMap.put(2000, "Bhanu");
		myMap.put(300, "Ramu");
		
		myMap.put(100, "Welcome");
		
		myMap.put(null, "abc");
		myMap.put(700, null);
		myMap.put(null, "xyz");
		myMap.put(600, null);
		
		System.out.println(myMap);
	}
}