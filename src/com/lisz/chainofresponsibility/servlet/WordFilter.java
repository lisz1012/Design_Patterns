package com.lisz.chainofresponsibility.servlet;

public class WordFilter extends AbstractFilter {

	public WordFilter(FilterChain fc) {
		super(fc);
	}

	@Override
	public boolean doFilter(Request request, Response response, FilterChain fc) {
		String message = request.getMessage();
		message = message.replaceAll("ass hole", "good person");
		request.setMessage(message);
		System.out.println(this.getClass().getSimpleName() + ": " + request.getMessage());
		fc.doFilter(request, response, fc);
		message = response.getMessage();
		message = message.replaceAll("shit", "good");
		response.setMessage(message);
		System.out.println(this.getClass().getSimpleName() + ": " + response.getMessage());
		return true;
	}

}
