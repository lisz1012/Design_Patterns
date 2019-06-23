package com.lisz.bridge.prototype;

public class Test {
	public static void main(String[] args) throws Exception {
		Person p1 = new Person();
		Person p2 = (Person)p1.clone();
		System.out.println(p2);
		System.out.println(p2.getLoc());
		
		System.out.println(p1.getLoc() == p2.getLoc());
		p1.getLoc().setStreet("sh");
		System.out.println(p2.getLoc());
		
		p2.setLoc((Location)p1.getLoc().clone());
		System.out.println(p1.getLoc() == p2.getLoc());
		p1.getLoc().setStreet("bj");
		System.out.println(p2.getLoc());
	}
}

class Person implements Cloneable {
	private int age = 8;
	private int score = 100;
	private Location loc = new Location("bj", 22);
	
	@Override
	public String toString() {
		return age + " " + score;
	}
	
	// 重写clone方法，改protected为public
	// Object的clone方法做的就是把beiclone对象的内存内容copy并dump到另一个位置
	// Location 引用地址被copy, 浅克隆
	// String类型的虽然是引用类型，但因为它是在常量池中，所以不可变，改String其实只是拨动指针，指向不同的常量
	// new String("abc")这样创造出来的String还是从堆里指向常量池中的那个String “abc”，除非能改变常量池中的
	// “abc", 堆里的那个对象只是个中转, String 无法克隆，没实现Cloneable接口。clone了解就好.
	// 用于属性很多，指定起来麻烦的情形。实际中用到的极少
	// 注意⚠️如果只是重写Object 的 clone方法而没有implement Cloneable接口的话会报异常
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public int getAge() {
		return age;
	}

	public int getScore() {
		return score;
	}

	public Location getLoc() {
		return loc;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}
	
	
}

class Location implements Cloneable {
	private String street;
	private int roomNo;
	public Location(String street, int roomNo) {
		super();
		this.street = street;
		this.roomNo = roomNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	@Override
	public String toString() {
		return street + " " + roomNo;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}