package com.evergent.coreJAVA.Collections;
import java.util.Vector;
import java.util.Enumeration;
public class CF7_VectorDemo {
	public static void main(String[] args) {
		Vector al = new Vector();
		al.add(100);
		al.add("Hello");
		al.add(45.5);
		Enumeration e = al.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());		
		}
	}
}