package day3homework;

public class StudentManager extends UserManager{
	
	public void add(Student student) {
		System.out.println(student.getId() + " "+ student.getFirstName() + " " + student.getLastName() + " isimli ��renci ba�ar� ile eklendi.");
	}
	
	public void delete(Student student) {
		System.out.println(student.getId() + " "+ student.getFirstName() + " " + student.getLastName() + " isimli ��rencinin bilgileri ba�ar� ile sistemden silindi.");
	}
	public void update(Student student) {
		System.out.println(student.getId() + " "+ student.getFirstName() + " " + student.getLastName() + " isimli ��rencinin bilgileri ba�ar� ile g�ncellendi.");
	}
	
	
	
	

}
