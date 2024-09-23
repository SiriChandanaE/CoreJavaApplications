package com.evergent.coreJAVA.ExceptionHandling;
class ProductNotFoundException extends Exception{
	public ProductNotFoundException(String message) {
		System.out.println("Hello: " +message);
	}
}
public class ProductImpl {
	int pno=105;
	public void myData() throws ProductNotFoundException{
		if(pno>100)
			throw new ProductNotFoundException("There is no Product");
		else
			System.out.println("Products are there");
	}
	public static void main(String[] args) {
		try {
			ProductImpl product1=new ProductImpl();
			product1.myData();
		}
		catch(ProductNotFoundException e) {
			System.err.println("I can handle: "+e);
		}

	}

}
