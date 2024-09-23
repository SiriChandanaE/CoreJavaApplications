package com.evergent.coreJAVA.studentapplication;

import java.io.Serializable;

public class StudentBean implements Serializable {
	private int studentId;
	private String studentName;
	private float marks;
	private String remark;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentname() {
		return studentName;
	}
	public void setStudentname(String studentname) {
		this.studentName = studentname;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}