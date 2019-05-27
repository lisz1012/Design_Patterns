package chainofresponsibility;

public class TagMessageFilter implements MessageFilter {

	@Override
	public Message doFilter(Message message) {
		String newMessage = message.getPayload().replaceAll("<", "[").replaceAll(">", "]");
		message.setPayload(newMessage);
		return message;
	}

}
