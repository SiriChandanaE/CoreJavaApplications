package com.evergent.coreJAVA.multithreading;
class myClass extends Thread{
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
	}
}
public class ThreadDemo1 {
	public static void main(String[] args) {
		myClass t1=new myClass();
		t1.setPriority(5);
		t1.start();
		myClass t2=new myClass();
		t2.setPriority(1);
		t2.start();
	}
}