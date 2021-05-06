package day3homework;

public class StudentManager extends UserManager{
	
	public void add(Student student) {
		System.out.println(student.getId() + " "+ student.getFirstName() + " " + student.getLastName() + " isimli öğrenci başarı ile eklendi.");
	}
	
	public void delete(Student student) {
		System.out.println(student.getId() + " "+ student.getFirstName() + " " + student.getLastName() + " isimli öğrencinin bilgileri başarı ile sistemden silindi.");
	}
	public void update(Student student) {
		System.out.println(student.getId() + " "+ student.getFirstName() + " " + student.getLastName() + " isimli öğrencinin bilgileri başarı ile güncellendi.");
	}
	
	
	
	

}
