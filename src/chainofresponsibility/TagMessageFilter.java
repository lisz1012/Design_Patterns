package chainofresponsibility;

public class TagMessageFilter implements MessageFilter {

	@Override
	public boolean doFilter(Message message) {
		String newMessage = message.getPayload().replaceAll("<", "[").replaceAll(">", "]");
		message.setPayload(newMessage);
		return true;
	}

}
