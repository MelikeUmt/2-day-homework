package day3homework;

public class InstructorManager extends UserManager{
	
	public void add (Instructor instructor) {
		System.out.println(instructor.getId() + " " + instructor.getFirstName() +" " + instructor.getLastName() + " isimli e�itmenimiz ba�ar� ile kay�t edilmi�tir.");
	}
	public void delete (Instructor instructor) {
		System.out.println(instructor.getId() + " " + instructor.getFirstName() +" " + instructor.getLastName() + " isimli e�itmenimizin bilgileri ba�ar� ile silinmi�tir.");
	}
	public void update (Instructor instructor) {
		System.out.println(instructor.getId() + " " + instructor.getFirstName() +" " + instructor.getLastName() + " isimli e�itmenimizin bilgileri ba�ar� ile g�ncellenmi�tir.");
	}
	
	

	

}
