package com.evergent.coreJAVA.Collections.Queue;

import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;

public class Queue_LinkedList10 {
	public static void main(String[] args) {
		Deque<String> pq=new LinkedList<>();
		pq.add("Ravi");
		pq.offer("Banana");
		pq.add("Shankar");
		pq.add("Chandu");
		System.out.println(pq);
		System.out.println(pq.peek());
	}
}