package com.evergent.CoreJAVA.RAM.Application3;

public class EmployeeInformation extends BankAccountDetails implements EmployeeInterface {
	int empno;
	double sal;
	String address;
	
	//Interface override methods
	public void employeeInfo(int eno, float sal) {
		this.empno=eno;
		this.sal=sal;
	}

	public void employeeAddress(String add) {
		this.address=add;	
	}

	public void employeeDetails() {
		System.out.println("Employee No: "+empno);
		System.out.println("Employee Salary: "+sal);
		System.out.println("Employee Address: "+address);
	}

	//abtsract class Implementation
	public void accountDetails() {
		System.out.println("My account details is: 12345678");
	}
	
	public void show() {
		System.out.println("This is show local method");
	}
	
	public static void main(String[] args) {
		//Interface methods calling
		EmployeeInformation emp= new EmployeeInformation();
		emp.employeeInfo(100, 5000);
		emp.employeeAddress("Bangalore");
		emp.employeeDetails();
		
		//Abstract methods
		emp.accountDetails();
		emp.bankDetails();
		
		//Call local methods
		emp.show();
		
		//Calling Bank RBI with HAS_A
		BankRBI rbi= new BankRBI();
		BankRBI rbi1= new BankRBI(3.3, 3.3);
		BankRBI.getBankDetails();
	}
}
