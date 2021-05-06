package day3homework;

public class InstructorManager extends UserManager{
	
	public void add (Instructor instructor) {
		System.out.println(instructor.getId() + " " + instructor.getFirstName() +" " + instructor.getLastName() + " isimli eðitmenimiz baþarý ile kayýt edilmiþtir.");
	}
	public void delete (Instructor instructor) {
		System.out.println(instructor.getId() + " " + instructor.getFirstName() +" " + instructor.getLastName() + " isimli eðitmenimizin bilgileri baþarý ile silinmiþtir.");
	}
	public void update (Instructor instructor) {
		System.out.println(instructor.getId() + " " + instructor.getFirstName() +" " + instructor.getLastName() + " isimli eðitmenimizin bilgileri baþarý ile güncellenmiþtir.");
	}
	
	

	

}
