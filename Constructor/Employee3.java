package com.evergent.coreJAVA.Constructor;
//Parameterized Constructor using THIS keyword
public class Employee3 {
	int eno;                 //0       123              (Step-7)
	String ename;            //Null    Siri
	double sal;              //0.0     50000.0
		Employee3() //Step-3
	{
		System.out.println("Default Constructor");
	}
	Employee3(int eno, String ename, double sal) //Step-5
	{
		this.eno=eno; //Step-6
		this.ename=ename;
		this.sal=sal;
	}	
	public void Display() //Step-9
	{
		System.out.println("Employee No: "+eno);
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee Salary: "+sal);
	}
	public static void main(String[] args) //Step-1 
	{
		new Employee3(); //Step-2
		Employee3 emp2=new Employee3(123,"Siri",50000); //Step-4
		emp2.Display();  //Step-8
	}   //Step-10
}  //Step-11
