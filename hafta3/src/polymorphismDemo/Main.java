package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		BaseLogger[] baseLoggers = new BaseLogger[] { new FileLogger(), new EmailLogger(), new DatabaseLogger(),
				new ConsoleLogger() };
		for (BaseLogger baseLogger : baseLoggers) {
			baseLogger.log("Log mesajı");
		}

		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add(); 
	}

}
