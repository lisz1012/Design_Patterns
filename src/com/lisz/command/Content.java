package com.lisz.command;

public class Content {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Content(String message) {
		super();
		this.message = message;
	}
	
	@Override
	public String toString() {
		return message;
	}
}
