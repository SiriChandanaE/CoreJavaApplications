package com.evergent.coreJAVA.Collections.map;
import java.util.Map;
import java.util.TreeMap;
/*
 * Sorted Order: TreeMap maintains its elements in ascending order of keys.
 * In this example, Student IDs are sorted, so when we print the TreeMap.
 * IDs are in ascending order.
 */
public class TreeMapDemo4 {
	public static void main(String[] args) {
		//Creating a TreeMap to store student records
		TreeMap<Integer, String> StudentRecords= new TreeMap<>();
		//Adding students records to the TreeMap
		StudentRecords.put(102, "Raju");
		StudentRecords.put(101, "Bhanu");
		StudentRecords.put(103, "Ramu");
		StudentRecords.put(104, "David");
		System.out.println(StudentRecords);
		//Displaying the TreeMap (sorted by Student ID)
		System.out.println("Student Records (sorted by ID)");
		
		for(Map.Entry<Integer,String> entry: StudentRecords.entrySet()) {
			System.out.println("ID: " +entry.getKey()+", Name: " +entry.getValue());
		}
	}
}