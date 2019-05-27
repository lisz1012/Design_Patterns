package com.lisz.chainofresponsibility.servlet;

public class HTMLFilter extends AbstractFilter {

	public HTMLFilter(FilterChain fc) {
		super(fc);
	}

	@Override
	public boolean doFilter(Request request, Response response, FilterChain fc) {
		String message = request.getMessage();
		message = message.replaceAll("<", "[");
		request.setMessage(message);
		System.out.println(this.getClass().getSimpleName() + ": " + request.getMessage());
		
		fc.doFilter(request, response, fc);
		
		message = response.getMessage();
		message = message.replaceAll(">", "]");
		response.setMessage(message);
		System.out.println(this.getClass().getSimpleName() + ": " + response.getMessage());
		return true;
		
		/* Output:
		 WordFilter: <H1>Trump is an good person, because he tries to build wall, which is a shit.</H1>
		 PoliticalFilter: <H1>lisz is an good person, because he tries to build wall, which is a shit.</H1>
		 HTMLFilter: [H1>lisz is an good person, because he tries to build wall, which is a shit.[/H1>
		 HTMLFilter: [H1]lisz is an good person, because he tries to build wall, which is a shit.[/H1]
		 PoliticalFilter: [H1]lisz is an good person, because he tries to give people money, which is a shit.[/H1]
		 WordFilter: [H1]lisz is an good person, because he tries to give people money, which is a good.[/H1]
		 */
	}

}
