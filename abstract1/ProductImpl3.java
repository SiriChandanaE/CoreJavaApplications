package com.evergent.coreJAVA.abstract1;

public class ProductImpl3 extends Product3{
	public ProductImpl3() {
		System.out.println("ProductImpl subclass Constructor");
	}
	public void newProduct() {
		System.out.println("My New Products");
	}
	public void show() {
		System.out.println("Local methods of product class");
	}
	public static void main(String[] args) {
		//Cannot instantiate the type Product
		//ProductImpl2 p2=new Product();
		Product3 p2=new ProductImpl3();
		p2.allProducts();
		p2.newProduct();
	}

}
