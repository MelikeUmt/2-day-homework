package day3homework;

public class Student extends User {
	String schoolName;
	int schoolNumber;
	
	public Student() { 
		
	}
	
	public Student(int id, String firstName, String lastName, String eMail, String schoolName, int schoolNumber, String password)
	{
	  super(id,firstName, lastName, eMail, password);
	  this.schoolName = schoolName;
	  this.schoolNumber = schoolNumber;}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getSchoolNumber() {
		return schoolNumber;
	}

	public void setSchoolNumber(int schoolNumber) {
		this.schoolNumber = schoolNumber;
	}
	
	
	
	
	

}
