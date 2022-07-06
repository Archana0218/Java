package Dep_inj_Example;

public class Student {
	 private String StudentName;
	 private int id;
	void disp()
	{
		System.out.println("Student name is  : "+StudentName +" And Studend Id is  "+id);
	}
	
	public void setStudentName(String studentName) {
		this.StudentName = studentName;
	}

	
	public void setId(int id) {
		this.id = id;
	}
	

}
