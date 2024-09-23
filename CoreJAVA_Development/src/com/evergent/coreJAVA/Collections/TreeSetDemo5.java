package com.evergent.coreJAVA.Collections;

import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetDemo5 {
	public static void main(String[] args) {
		TreeSet setList = new TreeSet();
		setList.add(100);
		setList.add(50);
		setList.add(45);
		setList.add(100);
		System.out.println(setList);
		Iterator i = setList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}