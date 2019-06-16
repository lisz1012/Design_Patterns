package com.lisz.builder.person;

public class Person {
	private int id;
	private String name;
	private int age;
	private double weight;
	private int score;
	private Location loc;

	private Person() {}
	
	// Builder用静态内部类访问被构建类的private的构造方法
	public static class PersonBuilder {
		Person p = new Person();
		
		public PersonBuilder basicInfo(int id, String name, int age) {
			p.id = id;
			p.name = name;
			p.age = age;
			return this;
		}
		
		public PersonBuilder withScore(int score) {
			p.score = score;
			return this;
		}
		
		public PersonBuilder withWeight(double weight) {
			p.weight = weight;
			return this;
		}
		
		public PersonBuilder atLocation(Location loc) {
			p.loc = loc;
			return this;
		}
		
		public Person build() {
			return p;
		}
	}
	
	public static void main(String[] args) {
		PersonBuilder builder = new PersonBuilder();
		Person person = builder.basicInfo(1, "Zhang San", 20)
                               .withScore(80)
                               .withWeight(100.00)
                               .atLocation(new Location("Seattle"))
                               .build();
		
		System.out.println(person);
	}

	@Override
	public String toString() {
		return id + " - " + name + " - " + age + " - " + score + " - " + weight + " - " + loc.getCity();
	}
}
