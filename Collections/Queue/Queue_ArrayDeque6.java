package com.evergent.coreJAVA.Collections.Queue;

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Queue_ArrayDeque6 {
	public static void main(String[] args) {
		ArrayDeque<String> pq=new ArrayDeque<>();
		pq.add("Ravi");
		pq.offer("Bhanu");
		pq.add("Shankar");
		pq.add("Chandu");
		System.out.println(pq);
		System.out.println(pq.peek());
	}
}