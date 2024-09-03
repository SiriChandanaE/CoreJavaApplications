package com.evergent.coreJAVA.Collections.Queue;

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Queue_ArrayDeque9_poll {
	public static void main(String[] args) {
		ArrayDeque<String> ad=new ArrayDeque<>();
		ad.add("Banana");
		ad.addFirst("Pineapple");
		ad.add("Watermelon");
		ad.addLast("Papaya");
		//ad.offerFirst("Kiwi");
		//ad.offer("Apple");
		//ad.offerLast("Mango");
		System.out.println(ad);
		System.out.println(ad.poll());
		System.out.println(ad.pollLast());
		System.out.println(ad.pollFirst());
	}
}