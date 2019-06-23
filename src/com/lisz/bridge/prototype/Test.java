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
	
	
}

class Location {
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
}