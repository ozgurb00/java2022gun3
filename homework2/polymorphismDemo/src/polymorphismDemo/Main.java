package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		/*
		 * EmailLogger _logger = new EmailLogger(); _logger.Log(" Email Log Mesajı ");
		 * 
		 * BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(),
		 * new DatabaseLogger(), new ConsoleLogger()}; for(BaseLogger logger:loggers) {
		 * logger.Log("Log mesajı"); }
		 */
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.Add();
		
	}

}
