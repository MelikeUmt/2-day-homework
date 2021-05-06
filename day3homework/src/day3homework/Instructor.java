package day3homework;

public class Instructor extends User {
	String experience;
	
	public Instructor() {}
	
	public Instructor( int id, String firstName, String lastName, String eMail, String experience,String password)
	{
		super(id,firstName, lastName, eMail, password);
		this.experience = experience;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	

}
