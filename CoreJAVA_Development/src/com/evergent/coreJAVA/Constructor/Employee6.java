package com.evergent.coreJAVA.Constructor;

class MyEmployee{
	int eno;
	public MyEmployee() {
	}
	public MyEmployee(int eno) {
		System.out.println("Employee No: " +eno);
	}
}
public class Employee6 extends MyEmployee{              
	String ename;            
	double sal;              
	Employee6() 
	{
		System.out.println("Default Constructor");
	}
	Employee6(int eno, String ename, double sal) 
	{
		super(eno); 
		this.ename=ename;
		this.sal=sal;
	}	
	public void Display() 
	{
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee Salary: "+sal);
	}
	public static void main(String[] args) 
	{
		new Employee6(); 
		Employee6 emp2=new Employee6(123,"Siri",50000);
		emp2.Display();  
	}   
}  
