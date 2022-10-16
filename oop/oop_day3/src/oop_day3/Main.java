package oop_day3;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		
		System.out.println(sayi1);
		
		int[] sayilar1 = new int[] {1, 2, 3};
		int[] sayilar2 = new int[] {10, 20, 30};
		sayilar1 = sayilar2;
		
		sayilar2[0] = 1000;
		
		System.out.println(sayilar1[0]);
		
		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		
		Customer customer = new Customer(); //instance oluşturmak
		customer.id = 1;
		customer.City = "İstanbul";
		
		//CustomerManager customerManager = new CustomerManager(customer);
		//customerManager.Save();
		//customerManager.Delete();
		
		Company company = new Company();
		company.TaxNumber = "100000";
		company.id = 100;
		company.CompanyName = "Arçelik";
		
		
		//IoC Container
		CustomerManager customerManager2 = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager2.GiveCredit();
		
		//DRY 

	}

}
