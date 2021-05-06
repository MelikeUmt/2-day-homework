package day3homework;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getId()+ " "+ user.getFirstName() +" " + user.lastName + " kullanýcý eklendi.");
		
	}
	
	public void delete (User user) {
		System.out.println(user.getId()+ " "+ user.getFirstName() +" " + user.lastName + " kullanýcý silindi.");
			
	}
	
	public void update (User user) {
		System.out.println(user.getId()+ " "+ user.getFirstName() +" " + user.lastName + " kullanýcý bilgileri güncellendi.");
		
	
	}

}
