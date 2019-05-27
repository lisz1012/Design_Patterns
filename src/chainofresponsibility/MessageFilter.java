package chainofresponsibility;

public interface MessageFilter {
	Message doFilter(Message message);
}
