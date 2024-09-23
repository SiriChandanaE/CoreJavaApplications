package com.evergent.coreJAVA.Constructor;
//Parameterized Constructor:
public class Employee2 {
	int eno;                 //0       123              (Step-7)
	String ename;            //Null    Siri
	double sal;              //0.0     50000.0
	
	Employee2() //Step-3
	{
		System.out.println("Default Constructor");
	}
	Employee2(int eno1, String ename1, double sal1) //Step-5
	{
		eno=eno1; //Step-6
		ename=ename1;
		sal=sal1;
	}	
	public void Display() //Step-9
	{
		System.out.println("Employee No: "+eno);
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee Salary: "+sal);
	}
	public static void main(String[] args) //Step-1 
	{
		new Employee2(); //Step-2
		Employee2 emp2=new Employee2(123,"Siri",50000); //Step-4
		emp2.Display();  //Step-8
	}   //Step-10
}  //Step-11
