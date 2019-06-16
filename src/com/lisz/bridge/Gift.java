package com.lisz.bridge;

public abstract class Gift {
	// 以聚合代替继承，防止类爆炸。抽象和具体两棵继承树分别发展，抽象类里面有具体类的引用
	protected GiftImpl giftImpl;
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " " + giftImpl.getClass().getSimpleName();
	}
}
