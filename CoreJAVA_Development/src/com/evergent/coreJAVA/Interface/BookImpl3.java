package com.evergent.coreJAVA.Interface;
/*
Java will support multiple inheritance through interface.
 */

public class BookImpl3 implements Book, NewBook {

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
	
	public void myNewBook() {
		System.out.println("MyNewBook");
	}
	
	public void dataInfo() {
		System.out.println("My New Data Info");
	}

	public static void main(String[] args) {
		BookImpl3 book1=new BookImpl3();
		book1.bookTitle();
		book1.bookAuthor();
		book1.bookPrice();
		book1.Show();
		book1.myNewBook();
		book1.dataInfo();
	}

}