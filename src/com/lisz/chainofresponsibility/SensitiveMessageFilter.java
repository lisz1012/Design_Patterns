package com.lisz.chainofresponsibility;

public class SensitiveMessageFilter implements MessageFilter {

	@Override
	public boolean doFilter(Message message) {
		String newMessage = message.getPayload().replaceAll("996", "955");
		message.setPayload(newMessage);
		return false;
	}

}
