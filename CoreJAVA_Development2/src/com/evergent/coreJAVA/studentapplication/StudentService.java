package com.evergent.coreJAVA.studentapplication;
public class StudentService {
    								//427      			Ram	        935
public int addStudentService(int studentId,String studentName,int marks)
{  String remark="";

if(marks<=300)
{
remark = "Poor";
}
else if(marks<=500)
{
remark = "Average";

}
else if(marks<=800)
{
remark = "Good";

}
else
{
remark = "Excellent";
}

StudentDAO studentDAO = new StudentDAO();
StudentBean studentBean=new StudentBean();
studentBean.setStudentId(studentId);	
studentBean.setStudentname(studentName);
studentBean.setMarks(marks);
studentBean.setRemark(remark);

int updateResult= studentDAO.addStudent(studentBean);

return 1;
}
}