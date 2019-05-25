package com.lisz.singleton;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

import com.lisz.singleton.eager.Dog;
import com.lisz.singleton.enumeration.Cat;
import com.lisz.singleton.lazy.Car;
import com.lisz.singleton.lazy.Plane;

public class TestSingleton {
	
	@Test
	public void testLazy() {
		Car c1 = Car.getInstance();
		Car c2 = Car.getInstance();
		assertEquals(c1, c2);
		
		Plane p1 = Plane.getInstance();
		Plane p2 = Plane.getInstance();
		assertEquals(p1, p2);
	}
	
	@Test
	public void testEager() {
		Dog d1 = Dog.getInstance();
		Dog d2 = Dog.getInstance();
		assertEquals(d1, d2);
	}
	
	@Test
	public void testEnum () {
		Cat c1 = Cat.INSTANCE;
		Cat c2 = Cat.INSTANCE;
		assertEquals(c1, c2);
		throw new NullPointerException();
		
	}
	
	public <E> void test(E ele) {
		
	}
	
	
}
