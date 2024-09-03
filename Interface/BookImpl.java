package com.evergent.coreJAVA.Interface;
/*
1. Interface is a keyword.
2. We can declare methods signatures only but not 
implementations.
3. By default all interface methods are abstract.
4. If any class implements interface that class 
should override all interface methods otherwise 
the class will be showing compile time error.
5. We can declare variables inside the interface 
all are public static final.
6. One class can implements more than one interface.
 */

public class BookImpl implements Book {

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
		BookImpl book1=new BookImpl();
		book1.bookTitle();
		book1.bookAuthor();
		book1.bookPrice();
		book1.Show();
	}
}