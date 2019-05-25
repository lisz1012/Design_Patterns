package com.lisz.singleton.enumeration;

//反射可以通过反射和class文件创建实例。枚举单例，enum没有构造方法，只返回INSTANCE这个值，不会返回构造方法
//反编译之后，枚举是一个abstract class
public enum Cat {
	INSTANCE; 
	private String name = "Tom";
	public void print() {
		System.out.println(name);
	}
}
