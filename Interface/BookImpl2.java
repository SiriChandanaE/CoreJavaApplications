package com.evergent.coreJAVA.Interface;
/*
We cannot create objects to interface, 
but we can create references to interface.
 */

public class BookImpl2 implements Book {

	public void bookTitle() {
		System.out.println("Core JAVA");
	}

	public void bookAuthor() {
		System.out.println("Oracle Corp: " +cName);
	}

	public void bookPrice() {
		System.out.println("Rs. 550");
	}
	
	public void Show() {
		System.out.println("Local method of BookIMPL");
	}

	public static void main(String[] args) {
		Book b2=new BookImpl2();
		b2.bookTitle();
		b2.bookAuthor();
		b2.bookPrice();
		//The method Show() is undefined for the type Book
		//b2.Show();
	}
}