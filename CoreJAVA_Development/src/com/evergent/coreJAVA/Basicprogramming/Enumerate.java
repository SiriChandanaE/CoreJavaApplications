package com.evergent.coreJAVA.Basicprogramming;

enum Color{
	RED, GREEN,BLUE;
}
enum News{
	North, East, West, South;
}
enum AbcProducts{
	Laptops, Desktops, Tabs;
}
enum Days{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}

public class Enumerate {

	public static void main(String[] args) {
		Color c= Color.RED;
		System.out.println(c);
		
		News s= News.North;
		System.out.println(s);
		
		AbcProducts p= AbcProducts.Laptops;
		System.out.println(p);
		
		Days day= Days.SUNDAY;
		System.out.println(day);

	}

}
