package chainofresponsibility;

public class TestChainOfResponsibility {
	
	public static void main(String[] args) {
		MessageFilterChain fc = new MessageFilterChain();
		fc.addFfilter(new TagMessageFilter())
		  .addFfilter(new SensitiveMessageFilter());
		
		MessageFilterChain fc2 = new MessageFilterChain();
		fc2.addFfilter(new FaceMessageFilter())
		   .addFfilter(new UrlMessageFilter());
		
		fc.addFfilter(fc2);	
		
		Message message = new Message();
		message.setName("lisz");
		message.setPayload("大家好:)，<tag> 欢迎访问996 lisz.com");
		fc.doFilter(message);
		System.out.println(message);
	}
}

class Message {
	private String name;
	private String payload;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
	@Override
	public String toString() {
		return name + ": " + payload + "\n";
	}
}