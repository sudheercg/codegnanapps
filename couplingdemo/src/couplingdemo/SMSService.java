package couplingdemo;

public class SMSService implements MessageService {

	

	@Override
	public void sendMessage(String message) {
		System.out.println("Sending SMS Message"+ message);
		
	}

}
