package chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
	private List<MessageFilter> filters = new ArrayList<>();
	
	public FilterChain addFfilter(MessageFilter filter) {
		filters.add(filter);
		return this;
	}
	
	public Message doFilter(Message message) {
		filters.forEach(f->f.doFilter(message));
		return message;
	}
}
