package com.evergent.coreJAVA.Constructor;

class Car{
	String color;
	int speed;
	Car(){
		color="White";
		speed=120;
	}
	Car(String color, int speed){
		this.color=color;
		this.speed=speed;
	}
	void Display() {
		System.out.println("Car Color: "+color);
		System.out.println("Car Speed: "+speed);
	}
}
public class MyCar6 {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.Display();
		Car car2=new Car("Red", 150);
		car2.Display();

	}

}
