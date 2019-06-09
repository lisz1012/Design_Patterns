package com.lisz.observer;

import java.util.List;

public class Baby {
	private String name;
	private List<WakeUpListener> listeners = PropertyMgr.getWakeUpListeners();
	
	public Baby(String name) {
		super();
		this.name = name;
	}
	
	public Baby addWakeUpListener(WakeUpListener listener) {
		listeners.add(listener);
		return this;
	}

	public void cry() {
		System.out.println(name + " cries, ah...ah...ah!!!");
		WakeUpEvent<Baby> e = new WakeUpEvent<Baby>(System.currentTimeMillis(), "bed", this);
		listeners.forEach(l->{
			l.actionPerformed(e);
		});
	}

	public String getName() {
		return name;
	}
}
