package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer melike = new Customer(1, "Melike", "UMUTLU");
		customerManager.add(melike);
		
		

	}

}
