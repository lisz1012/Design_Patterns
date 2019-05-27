package com.lisz.chainofresponsibility.servlet;

public class PoliticalFilter extends AbstractFilter {

	public PoliticalFilter(FilterChain fc) {
		super(fc);
	}

	@Override
	public boolean doFilter(Request request, Response response, FilterChain fc) {
		String message = request.getMessage();
		message = message.replaceAll("Trump", "lisz");
		request.setMessage(message);
		System.out.println(this.getClass().getSimpleName() + ": " + request.getMessage());
		fc.doFilter(request, response, fc);
		message = response.getMessage();
		message = message.replaceAll("build wall", "give people money");
		response.setMessage(message);
		System.out.println(this.getClass().getSimpleName() + ": " + response.getMessage());
		return true;
	}

}
