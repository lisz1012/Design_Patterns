package com.lisz.chainofresponsibility.servlet;

public class HTMLFilter extends AbstractFilter {

	public HTMLFilter(FilterChain fc) {
		super(fc);
	}

	@Override
	public boolean doFilter(Request request, Response response) {
		String message = request.getMessage();
		message = message.replaceAll("<", "[");
		request.setMessage(message);
		System.out.println(this.getClass().getSimpleName() + ": " + request.getMessage());
		if (fc.hasNext()) {
			Filter filter = fc.next();
			filter.doFilter(request, response);
		} else {
			response.setMessage(request.getMessage());
		}
		message = response.getMessage();
		message = message.replaceAll(">", "]");
		response.setMessage(message);
		System.out.println(this.getClass().getSimpleName() + ": " + response.getMessage());
		return true;
	}

}