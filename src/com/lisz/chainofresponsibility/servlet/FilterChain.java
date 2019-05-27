package com.lisz.chainofresponsibility.servlet;

import java.util.Iterator;

public class FilterChain extends AbstractFilter implements Iterator<Filter> {
	private int index;
	
	public FilterChain(FilterChain fc) {
		super(fc);
	}

	public boolean hasNext() {
		return index < filters.size();
	}
	
	public Filter next() {
		return filters.get(index++);
	}
	
	@Override
	public boolean doFilter(Request request, Response response, FilterChain fc) {
		if (hasNext()) {
			next().doFilter(request, response, this);
		} else {
			response.setMessage(request.getMessage());
		}
		
		return true;
	}

}
