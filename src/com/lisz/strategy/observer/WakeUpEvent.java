package com.lisz.strategy.observer;

public class WakeUpEvent <T>{
	private final long timestamp;
	private final String location;
	private final T source;
	
	public WakeUpEvent(long timestamp, String location, T source) {
		super();
		this.timestamp = timestamp;
		this.location = location;
		this.source = source;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public String getLocation() {
		return location;
	}

	public T getSource() {
		return source;
	}
}
