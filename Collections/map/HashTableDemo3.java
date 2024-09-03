package com.evergent.coreJAVA.Collections.map;
import java.util.HashMap;
public class HashTableDemo3 {

	public static void main(String[] args) {
		HashMap <String, String> capitalCities=new HashMap <String,String>();
		capitalCities.put("India", "Delhi");
		
		capitalCities.put("USA", "Washington DC");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("India", "Delhi");
		System.out.println(capitalCities);
		
		for(String s:capitalCities.keySet()) {
			System.out.println(s);
		}
	}
}