package com.evergent.coreJAVA.JavaBeans;

public class EmployeeImpl {

	public static void main(String[] args) {
		EmployeeBean employee=new EmployeeBean();
		employee.setEno(716);
		employee.setEname("Siri Chandana");
		employee.setSal(27000);
		System.out.println("Employee Number: " +employee.getEno());
		System.out.println("Employee Name: " +employee.getEname());
		System.out.println("Employee Salary: " +employee.getSal());
	}
}
