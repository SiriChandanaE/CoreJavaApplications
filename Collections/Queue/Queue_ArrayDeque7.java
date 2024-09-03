package com.evergent.coreJAVA.Collections.Queue;

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Queue_ArrayDeque7 {
	public static void main(String[] args) {
		ArrayDeque<String> ad=new ArrayDeque<>();
		ad.add("Banana");
		ad.addFirst("Pineapple");
		ad.add("Watermelon");
		ad.addLast("Papaya");
		ad.offerFirst("Kiwi");
		ad.offer("Apple");
		ad.offerLast("Mango");
		System.out.println(ad);
		System.out.println(ad.size());
		boolean t=ad.isEmpty();
		System.out.println(t);
		ad.clear();
		System.out.println(ad);
	
	}
}