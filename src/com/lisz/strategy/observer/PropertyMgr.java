package com.lisz.strategy.observer;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class PropertyMgr {
	private static Properties props = new Properties();
	private static final String PROPERTY_SEPARATOR = ",";
	
	static {
		try {
			props.load(PropertyMgr.class.getClassLoader().getResourceAsStream("config"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static List<WakeUpListener> getWakeUpListeners() {
		List<WakeUpListener> list = new ArrayList<>();
		String line = props.getProperty("wakeuplisteners");
		String strs[] = line.split(PROPERTY_SEPARATOR);
		for (String str : strs) {
			try {
				WakeUpListener listener = (WakeUpListener)Class.forName(str).getConstructor().newInstance();
				list.add(listener);
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException
					| ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
