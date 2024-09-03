package com.evergent.coreJAVA.LogicalProgramming1;

public class FibonacciUsingDoWhile {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		int n=5;
		System.out.print(a +" "+ b);
		int count=2;
		do {
			c=a+b;
			System.out.print(" " +c);
			a=b;
			b=c;
			count++;
			} 
		while(count < n);

	}

}
