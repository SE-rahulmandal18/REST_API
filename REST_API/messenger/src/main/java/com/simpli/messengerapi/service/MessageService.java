
package com.simpli.messengerapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.simpli.messengerapi.model.Message;
import com.simpli.messengerapi.repository.MessageRepository;

public class MessageService {

	private Map<Integer, Message> messages = MessageRepository.getMessages();
	
	// CRUD Operation
	
	public MessageService() {
		messages.put(1,  new Message(1, "Hello Jersey", "Rahul" ));
		messages.put(2,  new Message(2, "Hello JAX-RS", "Virat" ));
	}
	
	public List<Message> getAllMessages(){
		
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(int id) {
		
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		
		message.setId(messages.size() + 1);
	   
		messages.put(message.getId(), message);
	
		return message;
	}
	
	public Message deleteMessage(int id) {
		
		return messages.remove(id);
	}
	
	public Message updateMessage(Message message) {
		
	     messages.put(message.getId(), message);
	     return message;
	}
	
	public List<Message> getAllMessagesPaginated(int start, int size) {
		
		List<Message> list = new ArrayList<Message>(messages.values());
		
		if(start + size > list.size()) {
			return new ArrayList<Message>();
		}
		
		return list.subList(start, start+size);
	}
}
