package com.lisz.chainofresponsibility.servlet;

public class Request {
	private String message;

	public Request(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
