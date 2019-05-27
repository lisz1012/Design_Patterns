package com.lisz.chainofresponsibility.servlet;

public interface Filter {
	Filter addFilter(Filter filter);
	boolean doFilter(Request request, Response response);
}
