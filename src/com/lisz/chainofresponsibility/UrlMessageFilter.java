package com.lisz.chainofresponsibility;

public class UrlMessageFilter implements MessageFilter {

	@Override
	public boolean doFilter(Message message) {
		String newMessage = message.getPayload().replaceAll("lisz.com", "http://lisz.com");
		message.setPayload(newMessage);
		return true;
	}

}
