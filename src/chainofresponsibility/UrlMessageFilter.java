package chainofresponsibility;

public class UrlMessageFilter implements MessageFilter {

	@Override
	public Message doFilter(Message message) {
		String newMessage = message.getPayload().replaceAll("lisz.com", "http://lisz.com");
		message.setPayload(newMessage);
		return message;
	}

}
