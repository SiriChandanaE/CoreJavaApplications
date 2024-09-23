package com.evergent.coreJAVA.studentapplication;

import java.util.Scanner;

public class MainController1 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();

        System.out.print("Enter Student Name: ");
        String studentName = sc.next();

        System.out.print("Enter Student Marks: ");
        int marks = sc.nextInt();

        StudentService studentService = new StudentService();
        int updateCount = studentService.addStudentService(studentId, studentName, marks);

        // It's better to use "Updated" instead of "Inserted" for clarity
        System.out.println("Updated: " + updateCount + " record(s) successfully.");
        
        sc.close(); // Close the scanner to avoid resource leaks
    }
}
