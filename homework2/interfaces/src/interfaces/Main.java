package interfaces;

public class Main {

	public static void main(String[] args) {
		// interface'ler de abstract'lar gibi new'lenemezler
		CustomerManager customerManager = new CustomerManager();
		customerManager.customerDal = new OracleCustomerDal();
		customerManager.add();

	}

}
