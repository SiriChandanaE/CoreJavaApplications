package com.evergent.coreJAVA.CollectionsTask;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Student_Implementation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentInterface book=new StudentImpl();
		for(;;){
			System.out.println("1. Add Student 2.Search by ID 3.displayAll 4. exit");
			int no=sc.nextInt();
			switch(no){
			case 1:System.out.println("Enter the ID");
				   String ID=sc.next();
				   System.out.println("Enter the Student name");
				   String studentName=sc.next();
				   System.out.println("Enter the fee");
				   double fee=sc.nextInt();
				   Student s=new Student();
				   s.setID(ID);
				   s.setStudentName(studentName);
				   s.setFee(fee);
				   String message=Student.addStudent(s);
				   System.out.println(message);
				   break;
			case 2:System.out.println("Enter the ID");
			   	   String ID=sc.next();
			   	   book.searchByID(ID);
			   	   break;
			  			
			case 3:book.getAllDetails();
				break;
			case 4:System.exit(0);
			}
			
		}
	}
}
	
