package kodlamaIo.core.logging;

public class SMSLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("SMS ile Loglandı: "+data);
		
	}

}
