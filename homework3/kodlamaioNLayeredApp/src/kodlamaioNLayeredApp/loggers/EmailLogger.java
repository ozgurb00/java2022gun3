package kodlamaioNLayeredApp.loggers;

public class EmailLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Mail'e loglandı : " + data);
		
	}

}
