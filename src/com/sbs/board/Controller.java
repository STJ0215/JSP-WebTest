package com.sbs.board;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public abstract class Controller {
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected String action;
	

	public Controller(HttpServletRequest request, HttpServletResponse response, String action) {
		this.request = request;
		this.response = response;
		this.action = action;
	}
	
	
	public abstract String doAction() throws IOException;
}