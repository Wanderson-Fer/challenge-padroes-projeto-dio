package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.User;

public class UserService {
	private static List<User> instanceListUser = new ArrayList<User>();
	
	private UserService () {
		super();
		
		instanceListUser.add(new User("root", "iamroot"));		
	}
	
	public static List<User> getInstance() {
		return instanceListUser;
	}
	
	public void adicionarUsuario(String username, String password) {
		instanceListUser.add(new User(username, password));
	}
	
	public User obterUsuario(String username) {
		User user = instanceListUser.stream()
				.filter(u -> u.getUsername().equals(username))
				.findFirst()
				.get();
		
		return user;
	}
}
