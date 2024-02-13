package com.simpli.messengerapi.model;

import jakarta.ws.rs.CookieParam;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.MatrixParam;

public class ParamBeanFilter {
	private @MatrixParam("param") String matrixParam;
	private @HeaderParam("authSessionId") String authSessionId;
	private @HeaderParam("baseURI") String baseURI;
	private @CookieParam("name") String name;
	
	public String getMatrixParam() {
		return matrixParam;
	}
	public void setMatrixParam(String matrixParam) {
		this.matrixParam = matrixParam;
	}
	public String getAuthSessionId() {
		return authSessionId;
	}
	public void setAuthSessionId(String authSessionId) {
		this.authSessionId = authSessionId;
	}
	public String getBaseURI() {
		return baseURI;
	}
	public void setBaseURI(String baseURI) {
		this.baseURI = baseURI;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
