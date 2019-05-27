package chainofresponsibility;

public class FaceMessageFilter implements MessageFilter {

	@Override
	public boolean doFilter(Message message) {
		String newMessage = message.getPayload().replaceAll("\\:\\)", "^_^");
		message.setPayload(newMessage);
		return true;
	}

}
