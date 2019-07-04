package com.lisz.singleton.lazy;

public class Plane {
	/* volatile 避免指令重排带来的问题 
	 * 源文件编译成为class文件之后，一个语句会翻译成为好多汇编语句，
	 * 比如，new Pane()就要先申请空间，然后初始化，最后new完，然后
	 * 把引用返回给instance，有可能先执行第三句，先给出引用，此时检
	 * 查INCSTANCE已然不为空，上面第一次的if不执行，直接return
	 * INSTANCE了，但此时还没有初始化完成，可能得到不正确的初始化，
	 * 所以必须加volatile，1.线程间可见 2.防止指令重排。不加volatile
	 * 有可能产生一个半初始化的状态，但是太难模拟了，百万级的并发才可以
	 */
	private static volatile Plane INSTANCE = null;
	
	private Plane() {}
	
	public static Plane getInstance() {
		if (INSTANCE == null) {
			synchronized (Plane.class) {
				if (INSTANCE == null) {
					INSTANCE = new Plane();
				}
			}
		}
		return INSTANCE;
	}
}
