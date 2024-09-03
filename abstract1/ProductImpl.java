package com.evergent.coreJAVA.abstract1;

public class ProductImpl extends Product{
	public void newProduct() {
		System.out.println("My New Products");
	}
	public void show() {
		System.out.println("Local methods of product class");
	}
	public static void main(String[] args) {
		ProductImpl p1=new ProductImpl();
		p1.show();
		p1.newProduct();
		p1.allProducts();
	}

}
