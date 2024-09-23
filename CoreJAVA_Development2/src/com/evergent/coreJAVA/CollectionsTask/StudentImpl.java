package com.evergent.coreJAVA.CollectionsTask;
import java.util.HashSet;
import java.util.Set;
public class StudentImpl implements StudentInterface {
    private Set<Student> studentSet;
    public StudentImpl() {
        studentSet = new HashSet<>();
    }
    @Override
    public String addStudent(Student s) {
        studentSet.add(s);
        return s.getID();
    }
    @Override
    public void searchByID(String ID) {
        boolean found = false;
        for (Student student : studentSet) {
            if (student.getID().equals(ID)) {
                System.out.println(student.getID() + " " + student.getStudentName() + " " + student.getFee());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The student is not found");
        }
    }
    @Override
    public void getAllDetails() {
        if (studentSet.isEmpty()) {
            System.out.println("No students are available");
        } else {
            for (Student student : studentSet) {
                System.out.println(student.getID() + " " + student.getStudentName() + " " + student.getFee());
            }
        }
    }
}