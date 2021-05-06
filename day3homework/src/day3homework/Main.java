package day3homework;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Melike");;
		student1.setLastName("UMUTLU");
		student1.setSchoolName("MOSTEM");
		student1.setSchoolNumber(1492);
		student1.seteMail("example123@gmail.com");
		student1.setPasswor("43543");
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.delete(student1);
		studentManager.update(student1);
	
		System.out.println("    ");		
		
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setFirstName("Engin");
		instructor.setLastName("DEMÝROÐ");
		instructor.seteMail("engindemirog@gmail.com");
		instructor.setExperience("JAVA, PYTHON, C#, JAVASCRIPT, HTML, ASP.NET");
		instructor.setPasswor("45345");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		instructorManager.update(instructor);
		
		
		
				
		
		
		
		

	}

}
