package com.evergent.coreJAVA.CollectionsTask;

import java.util.Scanner;
public class Student_Implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentInterface studentInterface = new StudentImpl();
        while (true) {
            System.out.println("1. Add Student 2. Search by ID 3. Display All 4. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline left-over
            switch (choice) {
                case 1:
                    System.out.println("Enter the ID:");
                    String ID = sc.nextLine();
                    System.out.println("Enter the Student name:");
                    String studentName = sc.nextLine();
                    System.out.println("Enter the fee:");
                    double fee = sc.nextDouble();
                    sc.nextLine(); // Consume newline left-over
                    Student student = new Student();
                    student.setID(ID);
                    student.setStudentName(studentName);
                    student.setFee(fee);
                    String message = studentInterface.addStudent(student);
                    System.out.println("Student added with ID: " + message);
                    break;
                case 2:
                    System.out.println("Enter the ID:");
                    String searchID = sc.nextLine();
                    studentInterface.searchByID(searchID);
                    break;
                case 3:
                    studentInterface.getAllDetails();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}