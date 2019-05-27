package com.lisz.chainofresponsibility.servlet;

public class FilterTest {

	public static void main(String[] args) {
		Request request = new Request("<H1>Trump is an ass hole, because he tries to build wall, which is a shit.</H1>");
		Response response = new Response("");
		FilterChain fc = new FilterChain(null);
		fc.addFilter(new WordFilter(fc))
		  .addFilter(new PoliticalFilter(fc))
		  .addFilter(new HTMLFilter(fc));
		
		fc.doFilter(request, response, fc);
	}

}
