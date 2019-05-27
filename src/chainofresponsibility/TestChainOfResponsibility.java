package chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class TestChainOfResponsibility {
	
	public static void main(String[] args) {
		List<MessageFilter> filters = new ArrayList<>();
		filters.add(new TagMessageFilter());
		filters.add(new SensitiveMessageFilter());
		
		Message message = new Message();
		message.setName("lisz");
		message.setPayload("大家好:)，<tag> 欢迎访问996");
		filters.forEach(f->f.doFilter(message));
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