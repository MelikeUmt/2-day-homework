package day3homework;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getId()+ " "+ user.getFirstName() +" " + user.lastName + " kullan�c� eklendi.");
		
	}
	
	public void delete (User user) {
		System.out.println(user.getId()+ " "+ user.getFirstName() +" " + user.lastName + " kullan�c� silindi.");
			
	}
	
	public void update (User user) {
		System.out.println(user.getId()+ " "+ user.getFirstName() +" " + user.lastName + " kullan�c� bilgileri g�ncellendi.");
		
	
	}

}
