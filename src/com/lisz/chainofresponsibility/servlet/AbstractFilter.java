package com.lisz.chainofresponsibility.servlet;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFilter implements Filter {
	protected List<Filter> filters = new ArrayList<>();
	protected FilterChain fc;

	public AbstractFilter(FilterChain fc) {
		super();
		this.fc = fc;
	}

	@Override
	public Filter addFilter(Filter filter) {
		filters.add(filter);
		return this;
	}

}
