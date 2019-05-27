package chainofresponsibility;

public class SensitiveMessageFilter implements MessageFilter {

	@Override
	public Message doFilter(Message message) {
		String newMessage = message.getPayload().replaceAll("996", "955");
		message.setPayload(newMessage);
		return message;
	}

}
