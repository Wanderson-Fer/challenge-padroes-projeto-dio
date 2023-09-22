package com.auth;

public class LoginSystem {
	private static LoginSystem instance = new LoginSystem();
	
	private LoginSystem() {}
	
	public static LoginSystem getInstance() {
		return instance;
	}
	
	public boolean login(String username, String password) {
		
		return false;
	}
}
