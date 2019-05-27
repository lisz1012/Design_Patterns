package chainofresponsibility;

public class FaceMessageFilter implements MessageFilter {

	@Override
	public Message doFilter(Message message) {
		String newMessage = message.getPayload().replaceAll("\\:\\)", "^_^");
		message.setPayload(newMessage);
		return message;
	}

}
