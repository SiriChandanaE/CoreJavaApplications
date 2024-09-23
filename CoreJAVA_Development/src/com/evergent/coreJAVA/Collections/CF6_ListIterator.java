package com.evergent.coreJAVA.Collections;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;
public class CF6_ListIterator {
	public static void main(String[] args) {
		List al = new ArrayList();
		al.add("Ramu");
		al.add("Ravi");
		al.add("Balu");
		al.add("Bhanu");		
		ListIterator li = al.listIterator();
		li.add("welcome");
		while(li.hasNext()) {
			String s =(String)li.next();
			System.out.println(s);
			if(s.equals("bhalu"));
			li.remove();
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}
}