package chainofresponsibility;

public interface MessageFilter {
	boolean doFilter(Message message);
}
