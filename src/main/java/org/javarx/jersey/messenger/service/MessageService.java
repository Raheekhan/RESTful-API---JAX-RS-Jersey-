package org.javarx.jersey.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.javarx.jersey.messenger.model.Message;

public class MessageService {

	public List<Message> getAllMessages() {
		Message m1 = new Message(1L, "Hello World", "Rahee");
		Message m2 = new Message(2L, "Hello Jersey", "Rahee");
		
		List<Message> list = new ArrayList<Message>();
		list.add(m1);
		list.add(m2);
		
		return list;
	}
	
	public void getMessage() {
		
	}
	
	public void addMessage() {
		
	}
	
	public void updateMessage() {
		
	}
	
	public void removeMessage() {
		
	}
}
