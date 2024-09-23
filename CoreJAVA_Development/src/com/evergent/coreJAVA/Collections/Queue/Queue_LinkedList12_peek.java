package com.evergent.coreJAVA.Collections.Queue;

import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;

public class Queue_LinkedList12_peek {
	public static void main(String[] args) {
		Deque<String> ad=new LinkedList<>();
		ad.add("Banana");
		ad.addFirst("Pineapple");
		ad.add("Watermelon");
		ad.addLast("Papaya");
		//ad.offerFirst("Kiwi");
		//ad.offer("Apple");
		//ad.offerLast("Mango");
		System.out.println(ad);
		System.out.println(ad.peek());
		System.out.println(ad.peekLast());
		System.out.println(ad.peekFirst());
	}
}