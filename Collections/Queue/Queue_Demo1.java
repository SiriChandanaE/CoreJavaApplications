package com.evergent.coreJAVA.Collections.Queue;

import java.util.Queue;
import java.util.PriorityQueue;

//Addition: offer(), add()
public class Queue_Demo1 {
	public static void main(String[] args) {
		Queue<Integer> pq=new PriorityQueue<>();
		pq.add(8);
		pq.offer(2);
		pq.add(5);
		pq.add(9);
		System.out.println(pq);
	}
}