package com.evergent.coreJAVA.Constructor;
public class Employee5 {
	int eno;                 
	String ename;            
	double sal;              
		Employee5() 
	{
		System.out.println("Default Constructor");
	}
	Employee5(int eno) 
	{
		this.eno=eno;
	}
	Employee5(int eno, String ename, double sal) 
	{
		this(eno); 
		this.ename=ename;
		this.sal=sal;
	}	
	public void Display() 
	{
		System.out.println("Employee No: "+eno);
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee Salary: "+sal);
	}
	public static void main(String[] args)  
	{
		new Employee5(); 
		Employee5 emp2=new Employee5(123,"Siri",50000); 
		emp2.Display();  
	}  
}  
