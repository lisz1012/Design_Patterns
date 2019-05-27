package com.lisz.chainofresponsibility;

public interface MessageFilter {
	boolean doFilter(Message message);
}
