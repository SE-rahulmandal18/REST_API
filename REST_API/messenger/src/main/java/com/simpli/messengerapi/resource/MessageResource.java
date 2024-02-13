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
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.core.UriInfo;

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
	
//	@POST
//	public Message createMessage(Message message) { // request body
//		
//		return service.addMessage(message);
//		
//	}
	
	@POST
	public Response createMessage(Message message, @Context UriInfo info) { // request body
		
		Message newMessage = service.addMessage(message);
		
        Response response = Response.status(Status.CREATED).header("Header info", info.getBaseUri()).entity(newMessage).build();
		
		return response;
		
	}
	
//	@DELETE
//	@Path("/{messageId}")
//	public Message deleteMessage(@PathParam("messageId") int id) {
//		
//		return service.deleteMessage(id);
//	}
	
	
	@DELETE
	@Path("/{messageId}")
	public Response deleteMessage(@PathParam("messageId") int id) {
		
		Message  deletedMessage = service.deleteMessage(id);
		
		if(deletedMessage == null) {
			return Response.status(Status.NOT_FOUND).header("status", "NOT_FOUND").build();
		}
		
		return  Response.status(Status.OK).entity(deletedMessage).header("status", "Message FOUND and Deleted ").build();
	}
	
	@PUT
	@Path("/{messageId}")
	public Message updateMessage(@PathParam("messageId") int id, Message message) {
		
		message.setId(id);
		return service.updateMessage(message);
	}
	
 }

