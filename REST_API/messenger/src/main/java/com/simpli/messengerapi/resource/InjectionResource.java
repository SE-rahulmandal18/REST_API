package com.simpli.messengerapi.resource;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import jakarta.ws.rs.CookieParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.MatrixParam;
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
	public String getInjectionAnnotation(@MatrixParam("param") String matrixParam,
			@HeaderParam("authSessionId") String authSessionId, @HeaderParam("baseURI") String baseURI,
			@CookieParam("name") String name) {

		return "Matrix Param=" + matrixParam + 
				" Header Param Value= " + authSessionId + 
				" baseURI= " + baseURI+
				" Cookie value= " + name;
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
	
	String URI = info.getAbsolutePath().toString();
	            
	return "Absolute URI= "+ URI;
	 }
	
   }
}
