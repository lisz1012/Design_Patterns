package com.lisz.proxy.test;

public class UserManagerImpl implements UserManager {

	@Override
	public void addUser() {
		System.out.println("1. Insert to User table.");
		System.out.println("2. Log in log table.");
	}

}
