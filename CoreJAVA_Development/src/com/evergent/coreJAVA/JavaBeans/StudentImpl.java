package com.evergent.coreJAVA.JavaBeans;

public class StudentImpl {

	public static void main(String[] args) {
		//Initializing values to the Java Beans
		StudentBean stu=new StudentBean();
		stu.setSno(10);
		stu.setSname("Siri");
		stu.setAddress("Hyderabad");
		//Getting values from the java beans
		System.out.println(stu);
	}

}
