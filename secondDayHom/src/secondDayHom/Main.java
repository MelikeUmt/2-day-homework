package secondDayHom;


public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course (1, "Yaz�l�m Geli�tirici Kamp� ( C# + ANGULAR),", "Engin DEM�RO�,", 0);
		Course course2 = new Course (2, "Yaz�l�m Geli�tirici Kamp� (JAVA + REACT),", "Engin DEM�RO�,", 35);
	    Course course3 = new Course (3, "Progamlamaya Giri� i�in Temel Kurs,", "Engin DEM�RO�,", 20);
	    
	    System.out.println("T�M KURSLAR");
	   
	    Course[] course= { course1, course2, course3};
	    for (Course courses : course) {
	    	System.out.println(courses.courseId + " " + courses.courseName + " " + courses.instructor + " " + courses.progress);
	    	System.out.println("    ");
	    
	    }
		System.out.println(" ---------- ");

	    
	    CourseManager courseManager = new CourseManager();
		courseManager.addcourse(course1); 
		System.out.println("  ");
		courseManager.addcourse(course2); 
		System.out.println("  ");
		courseManager.addcourse(course3); 

		
	
		
	    
	    
		

	}

}
