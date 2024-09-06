package couplingdemo;

public class MessagingClient {
	
	MessageService service;
	
	public MessagingClient(MessageService service) {
			this.service = service;
	}
	
	public void processMessage(String message) {
			service.sendMessage(message);
	}
	
	

}
