package com.lisz.strategy.observer;

import java.util.ArrayList;
import java.util.List;

public class PropertyMgr {
	public static List<WakeUpListener> getWakeUpListeners() {
		List<WakeUpListener> list = new ArrayList<>();
		return list;
	}
}
