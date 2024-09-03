package com.evergent.coreJAVA.CollectionsTask;

import java.util.HashSet;
import java.util.Set;

public class StudentImpl implements StudentInterface {
	Set<Student> studentSet=null;
	public StudentImpl() {
		studentSet=new HashSet<Student>();
	}
	
	@Override
	public String addStudent(Student s) {
		studentSet.add(s);
		return s.getID();
	} 

	@Override
	public void searchByID(int ID) {
		boolean s=false;
		if(studentSet.size()>0 && studentSet!=null){
			for(Student student:studentSet){
				if(student.getID().equals(ID)){
					System.out.println(studentSet.getID()+" "+studentSet.getStudentName()+" "+studentSet.getFee());	
					s=true;
					break;	
				}
			}
		}
		if(!s)
			System.out.println("The book is not found");
			
	}

	@Override
	public void getAllDetails() {
			if(studentSet.size()>0){
				for(Book student:studentSet){
					System.out.println(student.getID()+" "+student.getStudentName()+" "+student.getFee());
				}
					
			}else{
				System.out.println("No books are available");
			}
	}


}
