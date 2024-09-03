package com.evergent.coreJAVA.Collections;
import java.util.HashSet;
public class HashSetDemo2 {
	public static void main(String[] args) {
		HashSet setList = new HashSet();
		setList.add(100);
		setList.add("Hello");
		setList.add(4.5);
		setList.add(100);
		System.out.println(setList);
	}
}
