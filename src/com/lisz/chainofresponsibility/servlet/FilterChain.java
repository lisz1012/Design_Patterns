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
		//  不是for或者while循环调用，而是类似于递归的挨个调用，这样能保证request 123，response 321 的顺序处理
		if (hasNext()) {
			next().doFilter(request, response, this);
		} else {
			response.setMessage(request.getMessage());
		}
		
		return true;
	}

}
