package com.lisz.chainofresponsibility.servlet;

public class FilterChain extends AbstractFilter {
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
	public boolean doFilter(Request request, Response response) {
		if (hasNext()) {
			next().doFilter(request, response);
		}
		
		return true;
	}

}
