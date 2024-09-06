package couplingdemo;

public class MessagingApplication {

	public static void main(String[] args) {

		
		//Creating the instances of different message services
		//In case of Spring,Container will create these objects
		MessageService emailService = new EmailService();
		MessageService smsService = new SMSService();
		
		//Inject the service into Client. 
		MessagingClient emailClient= new MessagingClient(emailService);
		MessagingClient smsClient = new MessagingClient(smsService);
		
		emailClient.processMessage("Hi from email");
		smsClient.processMessage("Hi from SMS");

		
		
		
		
	}

}
