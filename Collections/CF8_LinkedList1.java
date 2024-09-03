package com.evergent.coreJAVA.Collections;
import java.util.LinkedList;
public class CF8_LinkedList1 {
	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		myList.add("TATA");
		myList.add("BMW");
		myList.add("VOLVO");
		myList.addFirst("Maruthi");
		myList.addLast("Safari");
		myList.remove(4);
		System.out.println(myList);
		myList.clear();
		System.out.println(myList);
	}
}