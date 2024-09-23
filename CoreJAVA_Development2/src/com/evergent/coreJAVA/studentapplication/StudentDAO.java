package com.evergent.coreJAVA.studentapplication;
import java.util.ArrayList;
public class StudentDAO {
	                      // 427	Ram		935
	public int addStudent(StudentBean studentBean)
	{
		try{
			ArrayList studentList=new ArrayList();
			studentList.add(studentBean.getStudentId());
			studentList.add(studentBean.getStudentname());
			studentList.add(studentBean.getMarks());
			studentList.add(studentBean.getRemark());	
			
			System.out.println(studentList);
			
			System.out.println("Student ID :"+studentBean.getStudentId());
			System.out.println("Student Name :"+studentBean.getStudentname());
			System.out.println("Marks  :"+studentBean.getMarks());
			System.out.println("ReMarks :"+studentBean.getRemark());
			
			return 1;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}
}