package com.lisz.chainofresponsibility.servlet;

public class PoliticalFilter extends AbstractFilter {

	public PoliticalFilter(FilterChain fc) {
		super(fc);
	}

	@Override
	public boolean doFilter(Request request, Response response) {
		String message = request.getMessage();
		message = message.replaceAll("Trump", "lisz");
		request.setMessage(message);
		System.out.println(this.getClass().getSimpleName() + ": " + request.getMessage());
		if (fc.hasNext()) {
			Filter filter = fc.next();
			filter.doFilter(request, response);
		} else {
			response.setMessage(request.getMessage());
		}
		message = response.getMessage();
		message = message.replaceAll("build wall", "give people money");
		response.setMessage(message);
		System.out.println(this.getClass().getSimpleName() + ": " + response.getMessage());
		return true;
	}

}
