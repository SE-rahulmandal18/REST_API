package com.simpli.messengerapi.resource;

import java.util.List;

import com.simpli.messengerapi.model.Message;
import com.simpli.messengerapi.service.MessageService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {

	MessageService service = new MessageService();
	
//	@GET
////	@Produces(MediaType.APPLICATION_XML)
//	public List<Message> getMessages() {
//		
//		return service.getAllMessages();
//	}
//	
	
	
	@GET
	public List<Message> getMessages(@QueryParam("start") int start, @QueryParam("size") int size) {
		
		if(start >= 0 && size > 0) {
			

			return service.getAllMessagesPaginated(start,size);
		}
		
		return service.getAllMessages();
	}
	
	@GET
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId") int id) {
		
		return service.getMessage(id);
		
	}
	
	@POST
	public Message createMessage(Message message) { // request body
		
		return service.addMessage(message);
		
	}
	
	@DELETE
	@Path("/{messageId}")
	public Message deleteMessage(@PathParam("messageId") int id) {
		
		return service.deleteMessage(id);
	}
	
	@PUT
	@Path("/{messageId}")
	public Message updateMessage(@PathParam("messageId") int id, Message message) {
		
		message.setId(id);
		return service.updateMessage(message);
	}
	
 }

