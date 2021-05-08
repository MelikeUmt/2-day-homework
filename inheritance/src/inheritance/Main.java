package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer melike = new IndividualCustomer();
		melike.customerNumber = "12345 ";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910 ";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "9999 ";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {melike, abc, hepsiBurada};
		customerManager.addMultiple(customers);
		

	}

}
