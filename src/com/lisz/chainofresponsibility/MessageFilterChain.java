package com.lisz.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class MessageFilterChain implements MessageFilter {
	private List<MessageFilter> filters = new ArrayList<>();
	
	public MessageFilterChain addFfilter(MessageFilter filter) {
		filters.add(filter);
		return this;
	}
	
	public MessageFilterChain addFfilter(MessageFilterChain fc) {
		filters.add(fc);
		return this;
	}
	
	@Override
	public boolean doFilter(Message message) {
		for (MessageFilter messageFilter : filters) {
			if (!messageFilter.doFilter(message)) {
				return false;
			}
		}
		return true;
	}
}
