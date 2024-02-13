package com.simpli.messengerapi.resource;

import com.simpli.messengerapi.model.ParamBeanFilter;

import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.UriInfo;

@Path("inject")
public class InjectionResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("annotation")
	public String getInjectionAnnotation(@BeanParam ParamBeanFilter beanParam) {

		return "Matrix Param=" + beanParam.getMatrixParam() + 
				" Header Param Value= " + beanParam.getAuthSessionId() + 
				" baseURI= " + beanParam.getBaseURI()+
				" Cookie value= " + beanParam.getName();
	}
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("annotation2")
	public String getInjectionAnnotation2(@Context HttpHeaders header, 
			@Context UriInfo info){ {
			
//	Map<String, List<String>> headers = header.getRequestHeaders();
//	
//	Collection<List<String>> list =  headers.values();
//	System.out.println(list);
//	
	String URI = info.getAbsolutePath().toString();
	            
	return "Absolute URI= "+ URI;
	 }	
   }

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("login")
	public String login(@FormParam("userName") String userName) {
		
		return "Hello "+ userName;
	}
	
}
