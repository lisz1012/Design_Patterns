package com.lisz.bridge;

public class Boy {

	public void chase(Girl girl) {
		// 以聚合代替继承，防止类爆炸。抽象和具体两棵继承树分别发展，抽象类里面有具体类的引用
		Gift gift = new WarmGift(new Book());  	  //打印： WarmGift Book is given!
		//Gift gift = new WildGift(new Ring());   //打印：WildGift Ring is given!
		give(girl, gift);
	}
	
	private void give(Girl girl, Gift gift) {
		System.out.println(gift + " is given!");
	}
	
	public static void main(String[] args) {
		Boy boy = new Boy();
		Girl girl = new Girl();
		boy.chase(girl);
	}

}
