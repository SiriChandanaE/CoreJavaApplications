package com.evergent.coreJAVA.WrapperClasses;
import java.util.ArrayList;
public class WrapperClassDemo4 {

	public static void main(String[] args) {
		int a=10;
		Integer i1=new Integer(a);
		ArrayList myList = new ArrayList();
		myList.add(i1);
		
		Integer i2=new Integer(100);
		myList.add(i2);
		
		myList.add(new Integer(20));
		System.out.println(myList);
		
		ArrayList myList2 = new ArrayList();
		myList2.add(100);
		System.out.println(myList2.get(0));
	}
}